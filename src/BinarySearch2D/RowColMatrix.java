package BinarySearch2D;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {2,5,8},
                {4,7,10},
                {6,9,11}
        };
        System.out.println(Arrays.toString(search(arr,9)));
    }
    public static int[] search(int[][] arr , int target){
        int row=0;
        int col=arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[] {row,col};
            }
            if(arr[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}
