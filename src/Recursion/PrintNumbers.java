package Recursion;

public class PrintNumbers {
    public static void printNos(int N)
        {
            //Your code here
            if(N<1){
                System.out.print(N+" ");
                return;
            }
            printNos(N-1);
            System.out.print(N+" ");
        }
    public static void main(String[] args) {
        printNos(10);
    }
}
