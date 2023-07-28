package Practice;
import java.util.Arrays;

public class SelecsionSort {
    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int Max= MaxIndex(arr,0,last);
            swap(arr,Max,last);
        }
    }
    public static void swap(int[] arr,int max,int last){
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
    public static int MaxIndex(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
