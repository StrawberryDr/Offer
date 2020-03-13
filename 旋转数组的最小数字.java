import java.util.Scanner;

public class Solution {
    public static int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }else {
            int min = array[0];
            for(int i = 1;i < array.length;i++){
                if(array[i] < min){
                    min = array[i];
                }
            }
            return min;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[]{3,4,5,1,2};
        int min = minNumberInRotateArray(array);
        System.out.println(min);
    }
}
