package Arrays;
public class leftrotate1 {

    public static void lr1(int arr[]){
        int temp = arr[0];

        for(int i = 1 ; i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5} ;
        lr1(arr);

        for(int i = 0 ; i< arr.length ;i++){
            System.err.print(arr[i]+" ");
        }
    }
}
