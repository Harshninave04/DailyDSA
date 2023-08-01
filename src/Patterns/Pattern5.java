package Patterns;

public class Pattern5 {
    // *
    // * *
    // * * *
    // * * * *    // After this line the col is decreasing
    // * * *
    // * *
    // *
    public static void pattern(int num){
        for(int row=1;row<=(2*num-1);row++){
            // Below logic is for the row greater than num
            // because from further the col is decreasing
            int TotalColsInRow;
            if(row>=num){
                TotalColsInRow = 2*num-row;
            }else{
                TotalColsInRow=row;
            }

            for (int col = 1; col <=TotalColsInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
