package BinarySearch.Questions;

public class RotationCountInRBS {
        // IN this question we're checking how many times the array is rotated from their original array
    // we have to find the pivot point first and then add 1 to get the exact rotation count, simple !!
    public static int PivotSearch(int[] arr){
        int start = 0;
        int end=arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if ( mid<end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
        /* Solved by self , i appreciate ! */
    public static void main(String[] args) {
        int[] arr = {15,18,20,25,2,3,6,12};
        int rotationCount = PivotSearch(arr);
        System.out.println(" The rotation of array is " +(rotationCount+1) +" times");
    }
}
