package LinearSearch;

public class Minimum {

    public static void min(int[] arr){
        int minimum=arr[0];
        for (int i=1;i< arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        System.out.println(minimum);
    }
    public static void main(String[] args) {
        int[] arr = { 12 ,25, 65, -5, 94, 87, 36};
        min(arr);
    }
}
