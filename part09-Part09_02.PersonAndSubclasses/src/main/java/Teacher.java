public class Teacher extends Person {
    private int salary;

    public Teacher(String tname, String taddress, int salo){
        super(tname, taddress);
        salary = salo;

    }

    @Override
    public String toString(){
        return super.getName() + "\n  " + 
               super.getAddress() + "\n" +
               "  salary " + salary + " euro/month";
    }

}
