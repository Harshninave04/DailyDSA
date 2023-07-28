package Assignments;

import java.util.Scanner;

public class Maxi {
    public static void main(String[] args) {
        // maximum among three numbers
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a,b and c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max=a;
        if(max<b){
            max=b;
        } if(max<c) {
            max=c;
        }
        System.out.println(max);
    }
}
