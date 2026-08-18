//to find minimum number in the array

package Linearsearch;
public class LS3 {
    public static void main(String[] args) {
        int[] arr= {4,2,5,6,2,56,346,45};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }

}
