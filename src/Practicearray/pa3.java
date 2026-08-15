//package is not declared in compact source file
import java.util.Arrays;
import java.util.Scanner;
public class pa3 {
    public void reverse(int arr[], int n) {
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[n - i - 1] = arr[i];

        }
        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
        return;

    }

    //function to print an array
    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {5, 4, 3, 2, 1};

        //Creating instance of Solution Class
        pa3 ans = new pa3();
        System.out.print("Original Array: ");
        printArray(arr, n);
        // here i have not called the reversed array


    }
}

