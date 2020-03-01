//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
//使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
//并保证奇数和奇数，偶数和偶数之间的相对位置不变。

public class Solution {
    public static void reOrderArray(int [] array) {
        if(array.length <= 1){
            return;
        }
        int pre = 0;
        int cur = 1;
        int temp;
        while (cur < array.length){
            if(array[pre] % 2 == 1) {
                pre++;
                cur++;
            }else if(array[pre] % 2 == 0 && array[cur] % 2 == 1 && cur > pre){
                int j = cur;
                temp = array[cur];
                while (j > pre){
                    array[j] = array[j - 1];
                    j--;
                }
                array[pre] = temp;
            }else if(array[pre] % 2 == 0 && array[cur] % 2 == 0){
                cur++;
            }
        }
        for(int x : array){
            System.out.print(" "+ x);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int x : array){
            System.out.print(" "+ x);
        }
        System.out.println();
        reOrderArray(array);
    }
}
