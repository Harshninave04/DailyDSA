package Patterns;

public class Pattern8 {
        // * * * * *
        //   * * * *
        //     * * *
        //       * *
        //         *
    public static void pattern(int num){
        for(int row=num;row>0;row--){

            for (int spaces= 1; spaces<=(num-row) ; spaces++) {
                System.out.print("  ");
            }
            // Note: With every iteration of spaces ,next for-loop will run
            // i.e. Below (for-loop)
            for(int col=1; col<=(row);col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
