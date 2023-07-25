
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        String ans = "";
        String values = "";

        if(elements.size() == 0){
            ans = "The collection " + name + " is empty.";
        }

        if(elements.size() == 1){
            ans = "The collection " + name + " has 1 element:\n";
            for(String element: getElements()){
                values += element;
            }
            ans += values;   
        }

        if(elements.size() > 1){
            ans = "The collection "+ name + " has " + elements.size() + " elements:\n";
            for(String element: getElements()){
                values += (element + "\n");
            }
            ans += values;
        }

        return ans;
    }
    
}
