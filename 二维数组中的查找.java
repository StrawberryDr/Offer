import java.util.Scanner;

public class Solution {
    public static boolean Find(int target, int [][] array) {
        int len = array.length-1;   //行数
        int i = 0;
        int j = array[0].length-1;   //最后一列的下标
        while (i <= len && j>= 0){
            if(array[i][j] < target){
                i++;   //第i行的最后一个数小于target，则第i行所有元素都小于target；i++判断下一行
            }else if(array[i][j] > target){
                j--;  //第i行的第j个数大于target，j--,判断前一个数字
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        System.out.println(Find(9,array));
    }
}
