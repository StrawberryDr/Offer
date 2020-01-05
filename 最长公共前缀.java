import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class TestDemo {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String str = strs[0];
        for(int i = 0; i < strs.length;i++){
            while (strs[i].indexOf(str) != 0){
//indexOf(String str): 返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1
                str = str.substring(0,str.length()-1);
//str＝str.substring(int beginIndex，int endIndex);截取str中从beginIndex开始至endIndex结束时的字符串，并将其赋值给str;
            }
        }
        return str;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] english = new String[3];
        for(int i = 0;i < 3;i++){
            english[i] = sc.next();
        }
        String s = longestCommonPrefix(english);
        System.out.println(s);
    }
}
