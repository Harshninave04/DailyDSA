package Recursion;

public class TakeInputNumbers {
    public static void main(String[] args) {
        // Write a function that takes in a number and prints it
        // prints first 5 numbers : 1 2 3 4 5
        numbers(1);
    }

    public static void numbers(int n){
//        This is a base condition
        if(n==1000){
            return;
        }
        System.out.println(n);
        // Recursive call
        // If you're calling a function again and again , You can treat it as a separate call
        // in stack.
        numbers(n+1);

    }
//    public static void numbers1(int n){
//        System.out.println(n);
//        numbers2(n+1);
//    }
//    public static void numbers2(int n){
//        System.out.println(n);
//        numbers3(n+1);
//    }public static void numbers3(int n){
//        System.out.println(n);
//    }

}
