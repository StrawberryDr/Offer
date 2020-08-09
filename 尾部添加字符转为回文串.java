import java.util.Scanner;

public class Main {
    //首先判断输入的字符串是不是一个回文串
    public static boolean isPalindrome(String s){
        char[] array = s.toCharArray();
        int pre = 0;
        int end = array.length-1;
        if(s.equals("") || s.equals(null)){
            return false;
        }
        while (pre < end){
            if(array[pre++] != array[end--]){
                return false;
            }
        }
        return true;
    }

    public static void addCharInto(String string){
        boolean flag = isPalindrome(string);
        if(flag == true){ //如果输入字符串本身已经是回文串，直接输出
            System.out.println(string);
        }else {
            charInto(string);
        }
    }
    public static void charInto(String string){
        StringBuffer buffer = new StringBuffer(string);
        char[] array = string.toCharArray();
        int temp = array.length-1;
        if(temp -1 >= 0 && array[temp] == array[temp-1]){
            for(int i = temp-1;i >= 0;i--){
                if(i-1>=0){
                    buffer.append(array[i-1]);
                }
            }
        }else {
            int i = temp-1;
            while (i >= 0){
                buffer.append(array[i]);
                i--;
            }
        }

        System.out.println(buffer.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        addCharInto(string);
//        boolean flag = isPalindrome(string);
//        System.out.println(flag);
    }
}
