import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> plates;

    public VehicleRegistry(){
        plates = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(plates.containsKey(licensePlate)){
            return false;
        }else{
            plates.put(licensePlate, owner);
            return true;
        }
                        
    }

    public String get(LicensePlate licensePlate){
         if(plates.containsKey(licensePlate)){
            return plates.get(licensePlate);
         }else{
            return null;
         }
    }

    public boolean remove(LicensePlate licensePlate){
        if(plates.containsKey(licensePlate)){
            plates.remove(licensePlate);
            return true;
         }else{
            return false;
         }
    }

    public void printLicensePlates(){
        for(LicensePlate lp : plates.keySet()){
            System.out.println(lp.toString());
        }
    }

    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        String temp;

        for(LicensePlate lp : plates.keySet()){
            temp = plates.get(lp);
            if(!(owners.contains(temp))){
                owners.add(temp);
            }
        }

        for(String s : owners){
            System.out.println(s);
        }
    }


}
