import java.util.Scanner;

public class solution {
    public static double Power(double base, int exponent) {
        if(base == 0 && exponent == 0){
            return -1;
        }
        return Math.pow(base,exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        int exponent = scanner.nextByte();
        System.out.println(Power(base,exponent));
    }
}
