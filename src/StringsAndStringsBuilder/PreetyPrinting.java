package StringsAndStringsBuilder;

import java.util.Scanner;

public class PreetyPrinting {
    public static void main(String[] args) {
//        float decimal = 453.1280f;
//        decimal = 453.9980f;
//        System.out.printf("Formatted number is %.2f", decimal);
//        printf round off as well

//        System.out.println(Math.PI);
//        System.out.printf("PIE : %.3f", Math.PI);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter the favourite food :");
        String food = sc.nextLine();
        System.out.println("Enter the fact about you :");
        String fact = sc.nextLine();

        System.out.printf("Hello my name is %s and I love eating %s and Fact about me is I'm actually %s",name,food,fact);
    }
}
