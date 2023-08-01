import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
        
        MainProgram.sort(numbers);

    }

    public static int smallest(int array[]){
        int ans = array[0];
        for(int x = 0; x < array.length;++x){
            if(array[x] < ans){
                ans = array[x];
            }
        }
        
        return ans;
    }
    
    public static int indexOfSmallest(int array[]){
        int ans = array[0];
        int idx = 0;
        for(int x = 0; x < array.length;++x){
            if(array[x] < ans){
                ans = array[x];
                idx = x;
            }
        }
        
        return idx;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int ans = table[startIndex];
        int idx = 0;
        for(int x = startIndex; x < table.length;++x){
            if(table[x] <= ans){
                ans = table[x];
                idx = x;
            }
        }
        
        return idx;
    }
    
    public static void swap(int array[], int index1, int index2){
        int temp = array[index1];
        int temp2 = array[index2];
        array[index1] = temp2;
        array[index2] = temp;

    }
    
    public static void sort(int array[]){
        int idx;

        for(int x = 0; x < array.length;++x){
            idx = indexOfSmallestFrom(array, x);
            swap(array, idx, x);
            array.toString();
        }
    }
}
