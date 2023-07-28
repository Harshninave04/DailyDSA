package BinarySearch.Questions;

import static java.util.Arrays.binarySearch;

public class PositionOfInfArray {
    // Find the position of an element in a sorted array of infinite numbers
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 11;
        int answer = ans(arr,target);
        System.out.println(answer);

    }
    public static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end+1;
            end = end+(end-start+1)*2 ;    // The only important thing in question is this while loop
            start=temp;
        }
        return BinarySearch(arr,target,start,end);

    }
    public static int BinarySearch(int[] arr , int target,int start , int end){

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
}
