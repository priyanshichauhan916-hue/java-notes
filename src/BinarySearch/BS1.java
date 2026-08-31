package BinarySearch;

public class BS1 {
    public static void main(String[] args){

    }
    // return the index
    //return -1 if it doesnt exists
    static int binarysearch(int[] arr, int target){
        int left =0;
        int right = arr.length-1;
        //left+right cant be used as it might exceed the integer values
        int mid= left + (right-left)/2;
        if(target==arr[mid]){
            return mid;
        }else if(target>arr[mid]){
            left=mid+1;
        }else {
            right = mid - 1;
        }
        return -1;
    }


}

