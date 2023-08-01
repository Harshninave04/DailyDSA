package Patterns;

public class Pattern3 {
    // *  *  *  *
    // *  *  *  *
    // *  *  *  *
    // *  *  *  *
    public static void pattern(int num){
        for(int row=1;row<=num;row++){
            for (int col = 1; col <=(num) ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
