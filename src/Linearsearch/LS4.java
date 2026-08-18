//Search in 2D array
//to be done later,, code has some issues
package Linearsearch;
public class LS4 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        int target = 7;
        int ans = twodsearch(arr ,target);
        System.out.println(ans);
    }
    static int twodsearch(int[][] arr, int sol){
        if (arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
                for (int j=0; j<arr.length; j++){
                    if(arr[i][j] == sol){
                    if(arr[i][j]==sol){
                        return i;

                    }
                }
            }
        }
        return 0;


    }
}
