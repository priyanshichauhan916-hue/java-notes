package Linearsearch;

public class LS1_1 {
    public static void main(String[] args) {
        int[] nums = {12,13,14,45,5,7,57,67};
        int target = 57;
        int ans= linearsearch(nums, target);
        System.out.println(ans);
    }
    static int linearsearch(int[] array, int target){
        if (array.length==0){
            return -1;
        }
        for (int i=0; i<array.length; i++){
            int element = array[i];
            if (element == target){
                return i;
            }
        }
        return -1;

    }

}
