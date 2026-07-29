//sum of array

//defining the function
class Sol {
    int sum(int arr[], int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans + arr[i];
        }
        return ans;
    }
}
//code
public class arraylist5 {
    public static void main(String[] args){
        int n = 5;
        int arr[] = {1,2,4,6,7};

        // applying the function
        Sol addition = new Sol();
        int result = addition.sum(arr, n);
        System.out.println(result);


    }
}

