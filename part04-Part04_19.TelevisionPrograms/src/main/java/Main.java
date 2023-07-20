import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        int period;
        int maxPeriod;

        while(true){
            System.out.println("Name: ");
            name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }else{
                System.out.println("Duration: ");
                period = Integer.valueOf(scanner.nextLine());
                TelevisionProgram tp = new TelevisionProgram(name, period);
                programs.add(tp);

            }
        }

        System.out.println("Program's maximum duration? ");
        maxPeriod = Integer.valueOf(scanner.nextLine());

        for(TelevisionProgram program : programs){
            if(program.getDuration() <= maxPeriod){
                System.out.println(program.toString());
            }
        }
    }
}
