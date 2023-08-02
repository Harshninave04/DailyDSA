package Patterns;

public class Pattern7 {
        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *
    public static void pattern(int num){
        for (int row = 1; row <= num; row++) {

            for(int spaces=0; spaces<(num-row); spaces++){
                System.out.print("  ");
            }
            for (int col=row; col>=1; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }

}
