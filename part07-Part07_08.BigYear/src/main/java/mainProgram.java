import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        ArrayList<Bird> birds = new ArrayList<>();
        String command;
        String firstName;
        String secondName;
        boolean found = false;

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.print("?");
            command = scan.nextLine();

            if(command.equals("Add")){
                System.out.print("Name: ");
                firstName = scan.nextLine();
                System.out.print("Name in Latin: ");
                secondName = scan.nextLine();
                Bird newBird = new Bird(firstName,secondName);
                birds.add(newBird);
            }

            if(command.equals("Observation")){
                System.out.print("Bird? ");
                firstName = scan.nextLine();
                for(Bird bird: birds){
                    if(bird.getName().equals(firstName)){
                        bird.addObservation();
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("Not a bird!");
                }
            }

            if(command.equals("All")){
                for(Bird bird : birds){
                    System.out.println(bird.toString());
                }
            }

            if(command.equals("One")){
                System.out.print("Bird? ");
                firstName = scan.nextLine();
                for(Bird bird : birds){
                    if(bird.getName().equals(firstName)){
                        System.out.println(bird.toString());
                    }
                }
            }

            if(command.equals("Quit")){
                 break;
            }
        }
    }

}
