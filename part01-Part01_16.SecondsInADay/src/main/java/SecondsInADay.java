
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds;
        final int HOURS_IN_DAY = 24;
        final int MINUTES_IN_HOUR = 60;
        final int SECONDS_IN_MINUTE = 60;


        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        seconds = Integer.valueOf(scanner.nextLine()) * HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
        System.out.println(seconds);
    }
}
