
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int ans = 0;
        if(number1 > number2 && number1 > number3){
            ans = number1;
        }else if(number2 > number1 && number2 > number3){
            ans = number2;
        }else if(number3 > number1 && number3 > number1){
            ans = number3;
        }else{
            ans = number1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
