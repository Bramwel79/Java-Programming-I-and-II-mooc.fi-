public class Person {
    private String name;
    private String address;

    public Person(String pname, String paddress){
        name = pname;
        address = paddress;
    }
    
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
    
    @Override
    public String toString(){
       return name + "\n  " + address;
    }
}
