import java.util.Scanner;

public class su {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            long[] array = new long[n];
            int count = 0;
            for(int i = 0;i < array.length;i++){
                array[i] = scanner.nextInt();
                count += array[i] / 2;
            }
            System.out.println(count);
        }
    }

}
