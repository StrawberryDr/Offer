import java.util.Scanner;

public class Solution {
    public static int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1| n == 2){
            return 1;
        }
        int[] arr = new int[50];
        arr[0] = 1;
        arr[1]=1;
        for(int i = 3;i <= n;i++){
            arr[i-1] = arr[i-2]+arr[i-3];
        }
        return arr[n-1];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = Fibonacci(n);
        System.out.println(ret);
    }
}