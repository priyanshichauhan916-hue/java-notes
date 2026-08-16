package Linearsearch;
public class LS1 {
    public static void main(String[] args) {
        int[] nums = {12,13,14,45,5,667,57,67};
        int target = 57;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length ==0){
            return -1;
        }
        for (int index=0; index <arr.length; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        //when target not found
        return -1;

    }

}