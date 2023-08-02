import java.util.Scanner;

public class UserInterface {
    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
    }

    public void readPoints() {
        System.out.println("Enter point totals,-1 stops: ");
        while (true) {
            //System.out.print(" ");
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                //System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        System.out.println("Grade distribution:");
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        
        System.out.println("Point average (all): " + register.averageOfPoints());
        double ans = register.averageOfPointsPassing();
        if(ans > 0){
            System.out.println("Point average (passing): " + ans);
        }else{
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + register.passingPercent());
        //System.out.println("The average of grades: " + register.averageOfGrades());
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
