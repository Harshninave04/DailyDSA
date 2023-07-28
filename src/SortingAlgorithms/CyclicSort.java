package SortingAlgorithms;

import java.util.Arrays;

public class CyclicSort {

    public static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }

    public static void swap(int[] arr,int start,int next){
        int temp=arr[start];
        arr[start]=arr[next];
        arr[next]=temp;
    }

    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
