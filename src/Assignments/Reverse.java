package Assignments;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n;
        int ans=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        n=sc.nextInt();
        while(n>0){
            int rem=n%10;
            ans=(ans*10)+rem;
            n/=10;

        }
        System.out.println(ans+" ");
    }
}
