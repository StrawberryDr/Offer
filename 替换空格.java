import java.util.Scanner;

public class solution {
    public static String replaceSpace(StringBuffer str) {
        String tmp = "";
        for (int i = 0; i < str.length(); i++) {
            tmp = tmp + str.charAt(i);
        }
        tmp = tmp.replaceAll(" ","%20");
        return tmp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer string = new StringBuffer(str);
        String ret = replaceSpace(string);
        System.out.println(ret);
    }
}
