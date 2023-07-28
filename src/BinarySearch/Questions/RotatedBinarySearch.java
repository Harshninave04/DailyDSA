package BinarySearch.Questions;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target=2;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    public static int search(int[] arr,int target){
        int pivot = PivotSearch(arr);
        //if we do not find any pivot point in array
        // it means the array is not rotated
        if(pivot==-1){
            // just do normal binary search
            return BinarySearch(arr,target,0,arr.length-1);
        }
        if(target>arr[0]){
            // if target is greater than the start element then search from
            // start element till pivot-1;
            return BinarySearch(arr,target,0,pivot-1);
        }
        // else condition where target is less than the start element
        // then neglect the element from the start to the pivot
        // and search from the pivot+1 to the end
            return BinarySearch(arr,target,pivot+1,arr.length-1);
    }

    // This is normal Binary Search
    public static int BinarySearch(int[] arr , int target,int start,int end){

        while(start<=end){
            int mid = start+(end-start)/2;
            if (target>arr[mid]){
                start=mid+1;
            }else if (arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    // this method is for searching the largest number in the array
    // NOTE: Keep it in mind that this will not work in the duplicate values
    

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
}
