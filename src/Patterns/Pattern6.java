package Patterns;

public class Pattern6 {
    //          1
    //        2 1 2
    //      3 2 1 2 3
    //    4 3 2 1 2 3 4
    //  5 4 3 2 1 2 3 4 5

    public static void pattern(int num){
        for(int row=1;row<=num;row++){
            // To print spaces for each row , Formulae: (num-row)
            // 1st row contain 4 spaces
            // 2nd row contain 3 spaces
            // 3rd row contain 2 spaces
            // 4th row contain 1 spaces
            // 5th row contain 0 spaces
            for(int spaces=0;spaces<num-row;spaces++){
                System.out.print("  ");
            }
            // Below for loop is run till the middle column 1
            for (int col = row; col >= 1; col--) {
                System.out.print(col +" ");
            }
            // This loop runs next to the middle column starting form 2
            for (int col = 2; col<=row; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern(5);
    }
}
