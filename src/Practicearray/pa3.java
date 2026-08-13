package Practicearray;
import java.util.Arrays;
import java.util.Scanner;
public class pa3 {
    public void reverse(int arr[], int n) {
        int[] ans = new int[n];
        for(int i=n-1; i >=0;i--){
            ans[n-i-1] = arr[i];

        }
        for( int i=0; i<n; i++){
            arr[i] = ans[i];
        }
        return;
    }
}


