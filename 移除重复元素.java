import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {
        public static int removeElement(int[] nums, int val) {
            Arrays.sort(nums);
            int len = 0;
            for(int i = 0 ;i < nums.length;i++){
                if(nums[i] != val){
                    nums[len] = nums[i];
                    len++;
                }
            }
            return len;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{3, 2, 2, 3};
        int ret = removeElement(arr,3);
        System.out.println(ret);
    }
}
