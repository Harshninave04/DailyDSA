package Recursion;

// Doing binary search using recursion
public class BSusingRecursion {
    public static void main(String[] args){
        int[] arr = {2,4,5,12,21,32,41};
        int target = 2;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    public static int search (int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target>arr[mid]){
            return search(arr,target,mid+1,arr.length-1);
        }
        return search(arr,target,0,mid-1);
    }
}