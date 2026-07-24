//for finding max

package ArrayList;

import java.util.Arrays;

public class arraylist4 {
    public static void main(String[] args) {
        int[] arr= {8,3,5,6,8,9};
       // System.out.println(max(arr));
        System.out.println(maxRage(arr, 1, 3));
    }

    //writing the function maxRange
    static int maxRage(int[] arr, int start, int end) {
        if (start > end) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int maxValue = arr[start];
        for (int j = start; j <= end; j++) {
            if (arr[j] > maxValue) {
                maxValue = arr[j];
            }
        }
        return maxValue;
    }

    static int max(int[] arr){
        if (arr.length ==0){
            return -1;
        }


        int maxValue=arr[0];
        for(int i=1; i < arr.length; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

}
