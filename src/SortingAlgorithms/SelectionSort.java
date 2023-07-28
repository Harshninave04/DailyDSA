package SortingAlgorithms;


import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={0,4,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void selection(int[] arr){
        // we are going to run the loop till n-1
        for(int i=0;i<arr.length;i++){
            // find the maximum number in the array and swap with the last number
            int last = arr.length-i-1; // Here we are not using any less than sign, that's why we used -1 here
            int maxIndex=getMaxIndex(arr,0,last);// Find the maximum number from start to the last
            // and then subtract one index for every turn just to ignore the sorted part
            swap(arr,maxIndex,last);
            // swap the maxIndex number with the respective last index
        }
    }
    public static void swap(int[] arr,int start,int end){
        // This is basic swapping method
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static int getMaxIndex(int[] arr,int start, int end) {
        int max = start;  // let suppose the starting element is the maximum one
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {  // If arr[max] means start element is less than the starting index
                max = i;            // then store the value of i in the maximum
            }
        }
        return max;
    }
}
