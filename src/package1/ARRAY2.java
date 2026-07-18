package package1;

import java.util.Arrays;

public class ARRAY2 {
    public static void main(String[] args) {
       int[][] arr = new int[][]{{1,2,3},{4,5,6}};
       for(int[] a:arr){
           System.out.println(Arrays.toString(a));
       }
//        printing rows and columns in a 2D array
//for( int row=0; row< arr.length; row++){
//    for (int col=0; col<arr[row].length; col++){
//        System.out.print(arr[row][col]+ " ");
//    }
//}



    }

}

