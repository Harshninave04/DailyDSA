package Assignments;

public class SearchInPeakIndex {

    public static int PeakIndex(int[] arr){
        int start=1,end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public static int BinarySearch(int[] arr , int target, int start, int end){

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

    public static int search(int[] arr,int target){
        int peak = PeakIndex(arr);
        if(target>arr[peak]){
            int asc=BinarySearch(arr,target,peak+1,arr.length-1);
            return asc;
        }
        else{
            int desc=BinarySearch(arr,target,0,peak-1);
            return desc;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,23,25,34,43,32,21,1};
        int target=34;
        int ans = search(arr,target);
        System.out.println(ans);
    }
}
