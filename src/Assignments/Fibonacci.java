package Assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2; i<=n; i++){
            int sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }

    }
}

