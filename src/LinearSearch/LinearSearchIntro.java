package LinearSearch;

public class LinearSearchIntro {
    public static int LinearSearch(int arr[], int target){
        // Here we check whether the array is empty or not
        // If the array is empty we will not iterate the array
        if (arr.length==0){
            return -1;
        }
        // run the loop and iterate from index 0 to the end
        for(int index=0;index< arr.length;index++){
//            int element = arr[index];
            if(arr[index]==target){
                // arr[index]--> arr[0]=23,arr[1]=54,etc.
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {23,54,13,53,64,23,75};
        int target=13;
//        System.out.println(LinearSearch(arr,target));
        int index = LinearSearch(arr, target);
        System.out.println(" The targeted value found on the index " +index +"." );
    }
}
