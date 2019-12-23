import java.util.Scanner;
public class Solution {
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for(int i = 1;i <= n;i++){
            int number = i;
            while (number > 0){
                if(number % 10 == 1){
                    count++;
                }
                number = number/10;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = NumberOf1Between1AndN_Solution(n);
        System.out.println(ret);
    }
}
