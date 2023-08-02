public class Bird {
    private String name;
    private String latinName;
    private int observed;

    public Bird(String firstName, String secondName){
        name = firstName;
        latinName = secondName;
        observed = 0;
    }
    
    public String getName(){
        return name;
    }

    public int getObservations(){
        return observed;
    }

    public void addObservation(){
        observed += 1;
    }

    public String toString(){
        int timesSeen = getObservations();
        if(timesSeen == 1){
            return name + " (" + latinName + "): " + getObservations() + " observation";
        }else{
            return name + " (" + latinName + "): " + getObservations() + " observations";
        }
        
    }
}
