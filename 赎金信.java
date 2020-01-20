import java.util.Scanner;

public class Ransom {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] temp = new int[26];
        for(char c : ransomNote.toCharArray()){  //获取ransomNote中的字符
            int i = magazine.indexOf(c,temp[c - 'a']);//indexOf：从头开始查找指定字符，未找到当前字符，返回-1，
            if(i == -1){
                return false; //ransomNote字符串不能由magazine字符串中的字符构成；
            }
            temp[c - 'a'] = i+ 1; //如果当前字符匹配，则继续匹配索引值i+1位置的字符
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ransomNote = scanner.nextLine();
        String magazine = scanner.nextLine();
        boolean ret = canConstruct(ransomNote,magazine);
        System.out.println(ret);
    }
}
