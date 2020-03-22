public class solution {
    public static int GetNumberOfK(int [] array , int k) {
        int count = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] == k){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,2,3,3,3,4,5,6,7};
        System.out.println(GetNumberOfK(array,3));
    }
}
