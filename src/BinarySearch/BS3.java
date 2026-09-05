//ceiling=smallest element in array greater or equal to target
package BinarySearch;

public class BS3 {
    public static void main(String[] args){
        int [] arr= {1,2,4,5,6,7,8,9,90};
        int target=9;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }
    // return the index
    //return -1 if it doesnt exists
    static int ceiling(int[] arr, int target){
        int left =0;
        int right = arr.length-1;
        //left+right cant be used as it might exceed the integer values
        while(left<=right){
            int mid= left + (right-left)/2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return left;
    }
}
