package SortingAlgorithms.Questions;

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] arr){
        int i=0;
        while(i<arr.length){

            int correct = arr[i]; // correct headed towards the correct position of
            // the value . It checks whether the value is in their correct position or not
            // let suppose if the first position of array contains number such as 4
            // then it should be at their 4th index
            // This is what correct checks the respective value is on their perfect
            // position or not

            if(arr[i]<arr.length && arr[i]!=arr[correct])
            // In the first case it checks whether the value is less than the length of
                // array , if it is then it move to the next condition
                // And next condition checks whether the value is at their correct
                // position or not
                // In the second case if the value is not at their correct position then it swaps the value
            {
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            // case 1
            // Below condition states that if the value matched does not match the index value
            // then print the missing value as index value
            if(arr[index]!=index){
                return index;
            }

        }
        //case 2
        // let suppose the length of array is 4 and the missing number is also 4
        // In this case return the length of array
        return arr.length;
    }
    public static void swap(int[] arr,int start,int next){
        int temp=arr[start];
        arr[start]=arr[next];
        arr[next]=temp;
    }

    public static void main(String[] args) {
        int[] arr={4,0,2,1,3,6};
        System.out.println((missingNumber(arr)));
    }
}
