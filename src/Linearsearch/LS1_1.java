// arr = { 1,2,3,4,5,6,7,8};
//Search for 3 in the array in the range of index 1 to 4
package Linearsearch;

public class LS1_1 {
    public static void main(String[] args) {
        int[] nums = {12,13,14,45,5,7,57,67};
        int target = 57;
        int ans= linearsearch(nums, target, 1, 4);
        System.out.println(ans);
    }
    static int linearsearch(int[] array, int target, int start, int end){
        if (array.length==0){
            return -1;
        }
        for (int i=start; i<end; i++){
            int element = array[i];
            if (element == target){
                return i;
            }
        }
        return -1;

    }

}
