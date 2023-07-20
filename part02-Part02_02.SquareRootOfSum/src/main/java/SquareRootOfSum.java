
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first;
        int second;
        double squareRoot;
        System.out.println();
        first = Integer.valueOf(scanner.nextLine());
        System.out.println();
        second = Integer.valueOf(scanner.nextLine());
        squareRoot = Math.sqrt(first+second);
        System.out.println(squareRoot);
        
    }
}
