package SortingAlgorithms.Questions;

public class MissingNumberCyclicSort {
// In this question we're finding the missing number from the array of range
    // [0-n] , n is the length of array
        public static int MissingNumber(int[] arr){
            int i=0;
            while(i<arr.length){
                int correct=arr[i];
                if (arr[i]<arr.length && arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }else{
                    i++;
                }
            }
            for (int index = 0; index <arr.length; index++) {
                if(arr[index]!=index){
                    return index;
                }
            }
            return arr.length;
        }

        public static void swap(int[] arr,int start,int next){
            int temp=arr[start];
            arr[start]=arr[next];
            arr[next]=temp;
        }

    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
        System.out.println(MissingNumber(arr));
    }
}
