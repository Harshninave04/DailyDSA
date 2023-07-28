package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(arr.length +" ");

        Scanner sc = new Scanner(System.in);
            // size of row is 3 here and size of column is 2
            // So, row-->0 and goes upto arr.length i.e. 3
        for (int row=0;row< arr.length ;row++){
                // Here in inner loop the column index starts from 0
                // and end to arr[row].length i.e. for the particular row
                // it will check the size of column too
            for (int col=0;col< arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }
        // this loop is going to print the array but without square braces
//        for (int row=0;row< arr.length ;row++){
//            for (int col=0;col< arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

//        for (int row=0;row<arr.length ;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // Enhanced for loop with one datatype
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

        // The 3 above for loop does the same thing of printing the array itself
    }
}
