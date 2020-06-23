import java.util.Scanner;

public class Main {
    public static int Sum_Solution(int n){
        int sum = n;
        boolean temp = (n>0)&&(sum += Sum_Solution(--n)) >0;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum_Solution(n));
    }
}
