//Order agnostic binary search

package BinarySearch;

public class BS2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        int ans = orderAgnosticBS( arr, target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr, int target){
        int s =0;
        int end=arr.length-1;

        // find whether the sorted array is ascending or descending
        boolean isASC= arr[s]<arr[end];

        while(s<=end){
            int mid= s + (end-s)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isASC){
                if(target<arr[mid]){
                    end=mid-1;
                }else if(target>arr[mid]){
                    s=mid+1;
                }

            }else{
                if (target > arr[mid]) {
                    s = mid - 1;
                } else {
                    end = mid + 1;
                }
            }

        }
        return -1;


    }
}
