//for finding max

package ArrayList;

import java.util.Arrays;

public class arraylist4 {
    public static void main(String[] args) {
        int[] arr= {1,3,5,7,8,9};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxValue=arr[0];
        for(int i=1; i < arr.length; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

}
