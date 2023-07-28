package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=34;
        arr[1]=334;
        arr[2]=33;
        arr[3]=934;
        arr[4]=384;
        // Below are the for each loop
        for (int item : arr){
            System.out.println(( item+" " ));
        }
        // [34,334,33,934,384]
//        System.out.println(arr[3]);
        // Dynamic memory allocation
//        int[] array = {35,534,12,634,63423};
////        System.out.println(array[3]);
//        for(int i=0;i<arr.length ;i++){
//            arr[i]=sc.nextInt();
//
//        }
//        System.out.print(Arrays.toString(arr));
////        for(int i=0;i<arr.length ;i++){
////            System.out.print(arr[i]+" ");
//
//        }
//        String[] str= new String[3];
//        for (int i=0;i<str.length;i++){
//            str[i] = sc.next();
//        }
//        System.out.println(Arrays.toString(str));
//        str[2]="Harsh";
//        str[1]="Dev";
//
//        System.out.println(Arrays.toString(str));








    }
}
