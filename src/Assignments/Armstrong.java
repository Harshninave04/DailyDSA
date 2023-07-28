package Assignments;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int org=n;
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans+(rem*rem*rem);
            n/=10;
        }
        System.out.println(ans);
        if(org==ans){
            System.out.println("Armstrong !!");
        }else{
            System.out.println("Not Armstrong !!");
        }

    }
}
