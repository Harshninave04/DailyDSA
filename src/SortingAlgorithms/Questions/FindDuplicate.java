package SortingAlgorithms.Questions;

public class FindDuplicate {
    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // "i" is the index here
            // In below condition , we're checking current value is equal to index+1 or not
            // because index starts from zero
            if (arr[i] != i + 1) {
                // The correct index of the value should be the value-1
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    // Swap if the value is not at it's correct index otherwise return the
                    // value because the value is repeated value
                    swap(arr, i , correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,2};
        System.out.println(findDuplicate(arr));
    }
}
