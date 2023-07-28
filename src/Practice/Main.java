package Practice;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        int max=0;
        for (int start = 0; start < arr.length; start++) {

            max = start;
            if (arr[max] < start) {
                max = arr[start + 1];
            }
        }
        System.out.println(max);
    }

}
