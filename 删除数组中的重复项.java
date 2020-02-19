import java.util.Scanner;

public class TestDemo {
    public static int removeDuplicates(int[] nums) {
        int n = 1;
        for(int i = 1;i < nums.length;i++){
            if(nums[i] != nums[n-1]){
                n++;
                nums[n-1] = nums[i];
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        int ret = removeDuplicates(arr);
        System.out.println(ret);
    }
}
