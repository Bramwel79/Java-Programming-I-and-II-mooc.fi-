public class Item {
    private String itemName;
    private int ItemWeight;

    public Item(String name, int weight){
        itemName = name;
        ItemWeight = weight;
    }

    public String getName(){
        return itemName;
    }

    public int getWeight(){
        return ItemWeight;
    }

    public String toString(){
        return itemName + " (" + ItemWeight + " kg)";
    }

}
