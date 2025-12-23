package Arrays;

public class largElem{

    public static void largestelem(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        
        
    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0,9};
        largestelem(arr);
        

    }
}