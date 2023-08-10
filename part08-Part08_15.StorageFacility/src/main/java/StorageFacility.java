import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility(){
        facility = new HashMap<>();
    }
    public void add(String unit, String item){
        facility.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> words = facility.get(unit);
        words.add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> ans = new ArrayList<>();
        return facility.getOrDefault(storageUnit, ans);
    }

    public void remove(String storageUnit, String item){
        facility.get(storageUnit).remove(item);
        if(facility.get(storageUnit).isEmpty()){
            facility.remove(storageUnit);
        }
       
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> ans = new ArrayList<>();
        for(String k : facility.keySet()){
            if(!facility.get(k).isEmpty()){
                ans.add(k);
            }
            
        }
        
        return ans; 
        
    }
}
