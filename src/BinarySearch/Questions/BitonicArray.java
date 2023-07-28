package BinarySearch.Questions;
public class BitonicArray {

    public static int PeakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // you are in the descending part of array
                // this may be the answer , but traverse left side
                // this is why end!=mid-1
                end=mid;
            }else{
                start=mid+1;
                // because the middle is not greater than the middle+1
                //i.e. arr[mid]<arr[mid+1]
            }
        }
        // Hence if we are saying in last only one number will remain then
        // this is the possible answer
        // that's why you can return either start or end ;
        return start; // return end
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,45,47,3,2};
        int ans = PeakIndex(arr);
        System.out.println(ans);
    }
}
