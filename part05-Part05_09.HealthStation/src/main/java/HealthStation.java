
public class HealthStation {
    private int count; 

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        count += 1;
        return person.getWeight();
    }

    public void feed(Person person){
        int tempWeight = person.getWeight();
        tempWeight += 1;
        person.setWeight(tempWeight);
    }
    
    public int weighings(){
        return count;

    }
}
