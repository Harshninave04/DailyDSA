package BinarySearch.Questions;

public class FloorElement {
    // Floor is the smallest or equal to the target number
    public static int Floor(int[] arr , int target ){

        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if ( target <= arr[0]){
                return -1;
            }
            // if target > mid ; start = mid+1;
            if(target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }

        }
        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,7,12,24,29};
        int target =2;
        int floor = Floor(arr,target);
        System.out.println(floor);

    }
}
