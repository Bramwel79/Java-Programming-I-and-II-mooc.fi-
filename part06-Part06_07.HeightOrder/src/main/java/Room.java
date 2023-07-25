import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        persons = new ArrayList<>();
    }

    public void add(Person person){
        persons.add(person);
    }

    public boolean isEmpty(){
         return persons.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return persons;
    }

    public Person shortest(){
        if(persons.isEmpty()){
            return null;
        }
        Person shortest = persons.get(0);

        for(int x = 0; x < persons.size();++x){
            if(persons.get(x).getHeight() < shortest.getHeight()){
                shortest = persons.get(x);
            }
        }

        return shortest;
    }

    public Person take(){
        Person shortest = shortest();
        Person taken = null;
        for(int x = 0; x < persons.size();++x){
            if(persons.get(x).equals(shortest)){
                taken = persons.remove(x);
            }
        }
        
        return taken;
    }

}
