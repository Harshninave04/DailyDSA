package Recursion;

public class FindFibonacciNumber {
    // We are here to find the fibonacci number of asked number
    // We're not printing the series of fibonacci numbers
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    public static int fib(int num){
        /*
         Base condition are already known to us
         0th number is always 0
         and 1st number is always 1
         later on all the number is the addition of previous, and it's previous
        */
        if(num<2){
            return num;
        }
        // We're having recurrence relation
        // fib(n-1)+fib(n-2);
        return fib(num-1) + fib(num-2);
    }
}
