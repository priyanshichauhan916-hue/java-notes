package package1;

public class ARRAY2 {
    public static void main(String[] args) {
       int[][] arr = new int[][]{{1,2,3},{4,5,6}};
//        printing rows and columns in a 2D array
for( int row=0; row< arr.length; row++){
    for (int col=0; col<arr[row].length; col++){
        System.out.print(arr[row][col]+ " ");
    }
}


    }

}

