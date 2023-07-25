import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int mxWeight){
         maxWeight = mxWeight;
         items = new ArrayList<>();
    }

    public void addItem(Item item){
        int totalWeight = 0;

        if(items.isEmpty()){
            totalWeight = 0;
        }

        for(Item it : items){
            totalWeight += it.getWeight();
        }

        if(!(totalWeight + item.getWeight() > maxWeight)){
            items.add(item);
        }
        
    }

    public String toString(){
        String ans = "";
        int wght = 0;

        if(items.size() == 0){
            ans += "no items (0 kg)";
        }
        
        for(Item item : items){
            wght += item.getWeight();
        }

        if(items.size() == 1){
            ans += items.size() + " item (" + wght + " kg)";
        }

        if(items.size() > 1){
            ans += items.size() + " items (" + wght + " kg)";
        }
        
        return ans;
    }

    public void printItems(){
        for(Item item : items){
            System.out.println(item);
        }
    }

    public int totalWeight(){
        int total = 0;

        if(items.isEmpty()){
            total = 0;
        }

        for(Item item : items){
            total += item.getWeight();
        }

        return total;
    }

    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        
        Item heaviest = items.get(0);

        for(int x = 0; x < items.size();++x){
            if(items.get(x).getWeight() > heaviest.getWeight()){
                heaviest = items.get(x);
            }
        }
         
        return heaviest;
    }
}
