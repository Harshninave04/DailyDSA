package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){

        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void swap(int[] arr,int start,int end){
        // This is basic swapping method
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }


    public static void main(String[] args){
        int[] arr = {5,3,4,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
