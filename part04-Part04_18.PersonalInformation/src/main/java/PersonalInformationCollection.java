
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        String id;
        
        while(true){
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            if(firstName.isEmpty()){
                break;
            }else{
                System.out.println("Last name: ");
                lastName = scanner.nextLine();
                System.out.println("Identification number: ");
                id = scanner.nextLine();
                PersonalInformation info = new PersonalInformation(firstName, lastName, id);
                infoCollection.add(info);
            }

        }

        for(PersonalInformation pi : infoCollection){
            System.out.println(pi.getFirstName() + " " + pi.getLastName());
        }
    }
}
