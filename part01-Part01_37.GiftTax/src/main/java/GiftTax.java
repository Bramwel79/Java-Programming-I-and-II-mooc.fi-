
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int TAX_FLOOR_ONE = 5000;
        final int TAX_FLOOR_TWO = 25000;
        final int TAX_FLOOR_THREE = 55000;
        final int TAX_FLOOR_FOUR = 200000;
        final int TAX_FLOOR_FIVE = 1000000;
        final int TAX_RATE_ONE = 8;
        final int TAX_RATE_TWO = 10;
        final int TAX_RATE_THREE = 12;
        final int TAX_RATE_FOUR = 15;
        final int TAX_RATE_FIVE = 17;
        final int LOWER_ONE = 100;
        final int LOWER_TWO = 1700;
        final int LOWER_THREE = 4700;
        final int LOWER_FOUR = 22100;
        final int LOWER_FIVE = 142100;
        int giftAmount;
        double tax;

        System.out.println("Value of the gift?");
        giftAmount = Integer.valueOf(scan.nextLine());

        if(giftAmount < TAX_FLOOR_ONE) {
            System.out.println("No tax!");
        }else if(giftAmount >= TAX_FLOOR_ONE && giftAmount <= TAX_FLOOR_TWO) {
            tax = ((giftAmount - TAX_FLOOR_ONE) * (TAX_RATE_ONE / 100.0)) + LOWER_ONE;
            System.out.println("Tax:" + tax);
        }else if(giftAmount >= TAX_FLOOR_TWO && giftAmount <= TAX_FLOOR_THREE) {
            tax = ((giftAmount - TAX_FLOOR_TWO) * (TAX_RATE_TWO / 100.0)) + LOWER_TWO;
            System.out.println("Tax:" + tax);
        }else if(giftAmount >= TAX_FLOOR_THREE && giftAmount <= TAX_FLOOR_FOUR) {
            tax = ((giftAmount - TAX_FLOOR_THREE) * (TAX_RATE_THREE / 100.0)) + LOWER_THREE;
            System.out.println("Tax:" + tax);
        }else if(giftAmount >= TAX_FLOOR_FOUR && giftAmount <= TAX_FLOOR_FIVE) {
            tax = ((giftAmount - TAX_FLOOR_FOUR) * (TAX_RATE_FOUR / 100.0)) + LOWER_FOUR;
            System.out.println("Tax:" + tax);
        }else if(giftAmount >= TAX_FLOOR_FIVE) {
            tax = ((giftAmount- TAX_FLOOR_FIVE) * (TAX_RATE_FIVE / 100.0)) + LOWER_FIVE; 
            System.out.println("Tax:" + tax);
        }
    }
}
