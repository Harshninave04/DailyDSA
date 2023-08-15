package TimeAndSpaceComplexity;

public class Fib {

    public static long fibFormulae(int n){
        return (long) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }


    public static void main(String[] args){
        System.out.println(fibFormulae(50));
    }
}
