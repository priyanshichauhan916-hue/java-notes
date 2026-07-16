package package1;

import java.util.Scanner;

public class ARRAY1 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int[] arr1= new int[6];
        arr1[0]=22;
        arr1[1]=33;
        arr1[2]=44;
        arr1[3]=55;
        arr1[4]=66;
        arr1[5]=77;
        arr1[6]=88;

        //for loop taking input
        for (int i=0; i<arr1.length; i++){
            arr1[i] = in.nextInt();
        }
        //for loop for printing the given input
        for (int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ") ;
        }


    }


}
