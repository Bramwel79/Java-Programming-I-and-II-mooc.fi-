import java.util.ArrayList;

public class Hold {
    private int holdMaxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight){
        holdMaxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        int suitcaseTotalWeight = 0;
        
        if(suitcases.isEmpty()){
            suitcaseTotalWeight = 0;
        }

        for(int x = 0; x < suitcases.size();++x){
            suitcaseTotalWeight += suitcases.get(x).totalWeight();
        }

        if(!(suitcaseTotalWeight + suitcase.totalWeight() > holdMaxWeight)){
            suitcases.add(suitcase);
        }
        
    }

    public String toString(){
        int total = 0;

        if(suitcases.isEmpty()){
            total = 0;
        }

        for(int x = 0; x < suitcases.size();++x){
            total += suitcases.get(x).totalWeight();
        }

        return suitcases.size() + " suitcases (" + total + " kg)";
    }

    public void printItems(){
        for(Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
}
