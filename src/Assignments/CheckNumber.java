package Assignments;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        long n=sc.nextInt();
        int count=0;
        while(n>0){
            long rem= (int) (n%10);
            if(rem==6){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
