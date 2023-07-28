package Array;

public class Max {
    public static int MaxV( int max[]){
        int MaxValue = max[0];
        for (int i=1;i< max.length;i++){
            if(max[i]>MaxValue){
                MaxValue=max[i];
            }
        }
        return MaxValue;
    }
    public static int MinV(int[] min ){
        int MinValue= min[0];
        for (int i=1;i< min.length;i++){
            if (min[i]<MinValue){
                MinValue=min[i];
            }
        }
        return MinValue;
    }
    public static void main(String[] args) {
        int[] max = {2,5,1,4,7,10};
        System.out.println(MaxV(max));
        System.out.println(MinV(max));
    }
}
