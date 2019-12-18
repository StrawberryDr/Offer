import java.util.Scanner;

public class Solution {
    public static int NumberOf1(int n) {
        int count = 0;
        int i = 0;
        for(i = 0;i < 32;i++){
            if(((n >> i) & 1 ) == 1){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = NumberOf1(n);
        System.out.println(ret);
    }
}
