import java.util.Scanner;

public class Main {
    public static int func(String str,char key){
        int count = 0;
        if(str != null && str.length() > 0){
            for(int i = 0;i < str.length();i++){
                if(key == str.charAt(i)){
                    count++;
                }
            }
        }else{
            count = 0;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char key = s.next().charAt(0);
        int i = func(str,key);
        System.out.println(i);
    }
}
