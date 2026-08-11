//check if the array is sorted

class pa2 {
    public boolean arraySortedOrNot(int[] arr, int n) {
        for (int i =0; i<arr.length -1; i++) {
            for (int j=0;j<arr.length; j++){
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        pa2 solution= new pa2();

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int n = arr.length;

        boolean sorted = solution.arraySortedOrNot(arr, n);

        if(sorted){
            System.out.println("Sorted array");
        } else{
            System.out.println("Not sorted array");
        }

    }

}
