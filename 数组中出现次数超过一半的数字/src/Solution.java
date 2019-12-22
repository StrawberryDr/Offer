import java.util.Scanner;

public class Solution {
    public static int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 0){
            return 0;
        }
        for(int i = 0;i < array.length;i++){
            int num = array[i];
            double count = 0;
            for(int j = 0;j < array.length;j++){
                if(num == array[j]){
                    count++;
                }
            }
            if(count > (double)array.length/2){
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0;i < 9;i++){
            arr[i] = sc.nextInt();
        }
        int ret = MoreThanHalfNum_Solution(arr);
        System.out.println(ret);
    }
}
