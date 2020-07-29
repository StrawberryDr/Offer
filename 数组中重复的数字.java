public class Solution {
    public static boolean duplicate(int numbers[],int length,int [] duplication){
        if(numbers == null || length <= 0){
            return false;
        }
        int i = 0;
        while (i < length){
            if(numbers[i] == i){
                i++;
            }else {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                } else {
                    int temp = numbers[i];
                    numbers[i] = numbers[numbers[i]];
                    numbers[temp] = temp;
                }
            }
        }
        return false;
    }
}
