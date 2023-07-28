package LinearSearch;

public class LinearSearchInRange {
    public static int LinearSearchRange(int arr[],int target,int start,int end ){
        if (arr.length==0){
            return -1;
        }
        for (int index=start ; index<=end ;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 12 ,25, 65, 94, 87, 36};
        int target = 87;
        int index = LinearSearchRange(arr, target, 1 , 4);
        System.out.println(" The targeted value found on the index " +index +"." );
    }
}
