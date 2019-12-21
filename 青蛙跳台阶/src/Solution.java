import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Solution {
    public static int JumpFloor(int target) {
        if(target == 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        int num1 = 1,num2 = 2,num = 0;
        for(int i = 3;i <= target;i++){
            num = num1 + num2;
            num1 = num2;
            num2 = num;
        }
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ret = JumpFloor(target);
        System.out.println(ret);
    }
}
