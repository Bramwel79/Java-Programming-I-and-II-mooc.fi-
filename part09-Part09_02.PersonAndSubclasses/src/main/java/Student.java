public class Student extends Person{
    private int credit;

    public Student(String sname, String saddress){
        super(sname,saddress);
        credit = 0;
    }

    public void study(){
       credit +=1;
    }
    
    public int credits(){
        return credit;
    }


    @Override
    public String toString(){
        return super.getName() + "\n  " + 
               super.getAddress() + "\n" +
               "  Study credits " + credits();
    }


}
