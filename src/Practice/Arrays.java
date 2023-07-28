package Practice;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the no. of values needed :");
//        int nums=sc.nextInt();
//        arrays(nums);


    }



    public static void arrays(int nums){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[nums];
        for(int i=0;i<nums;i++){
            System.out.println("Enter the number :");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<nums;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
