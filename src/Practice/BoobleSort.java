package Practice;
import java.util.Arrays;

public class BoobleSort {
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped=false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-3,0,8};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
