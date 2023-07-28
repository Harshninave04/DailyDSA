package Array;

public class ColumnNoFixedSize {
    // Here in this the column is of random length/size
    public static void main(String[] args) {
        // This is two-dimensional array that's why we are using the two square brackets
        int[][] arr = {
                {1, 3, 4, 2},
                {4, 5, 2,6,5},
                {2,3, 1}

        };
        for (int row=0;row<arr.length;row++){
            // for the condition arr[0]--> there is a size 4
            // for the condition arr[1]--> there is a size 3
            // for the condition arr[2]--> there is a size 2
            // Above statement basically means till the size of the array row
            for (int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}

