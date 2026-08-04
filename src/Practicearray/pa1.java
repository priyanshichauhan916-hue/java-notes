package pa1;

class Solution{
    public int countodd(int[] arr, int n) {
        int count = 0;
        for(int i=0 ; i< n; i++){
            if (arr[i] % 2 == 1){
                count++;
            }gggit
        }
        return count;
    }
    public static void main (String[] args){
        Solution s= new Solution();
        int[] arr= {1,3,5,56,34};
        int n = arr.length;

        int count = s.countodd(arr, n);
        System.out.println(count);
    }
}





