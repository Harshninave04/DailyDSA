package Assignments;

public class MountainArray {
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

    public static void main(String[] args) {
        int[] arr = {12,23,25,34,62,43,32,21,1};
        int answer = PeakIndex(arr);
        System.out.println(answer);
    }
}
