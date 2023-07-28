package BinarySearch.Questions;

public class CeilingElement {

    // Function to find the ceiling element in a sorted array
    public static int findCeiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;
        // what if the target is greater than the greatest element in array then return -1
        if(target> arr[arr.length - 1]){
            return -1;
        }

        // Perform binary search to find the ceiling element
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // If the middle element is less than or equal to the target,
            // move the start pointer to mid + 1
            if (target> arr[mid]) {
                start = mid + 1;
            }
            // If the middle element is greater than the target,
            // move the right pointer to mid - 1
            else{
                end = mid - 1;
            }
        }
        // The left pointer now points to the smallest element greater than the target
        return arr[start];
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18,23};
        int target =24;
        System.out.println(findCeiling(arr,target));
    }
}
