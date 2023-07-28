package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void bubble(int[] arr){
        boolean swapped;
        // run the outer loop till n-1 times
        for (int i=0;i<arr.length;i++){
            swapped=false;
            // for each step, max item will come at the last respective index
            for(int j=1;j<arr.length-i;j++){
                // swap if the item is smaller than the previous item
                if (arr[j]<arr[j-1]){
                    // remember the j is initially starting from 1 and comparing
                    // itself with the previous one.
                    // swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,6,34,89,53,78};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

}
