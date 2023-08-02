package Patterns;

public class Pattern8 {

    public static void pattern(int num){
        for(int row=0;row<num;row++){
            for(int col=1; col<=(num-row);col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern(5);
    }
}
