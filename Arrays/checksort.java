package Arrays;

public class checksort {

    public static boolean checksortt(int arr[]){
        int count = 0 ;
        int n = arr.length;

        for ( int i = 0 ; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;
            }    
        }
        if(arr[n-1]>arr[0]){
            count++;
        }

        return count<=1;
    }
    public static void main ( String args[]){
        int arr[] = {1,2,4,5,6,9,0};
        
        System.out.println(checksortt(arr));
    }
}
