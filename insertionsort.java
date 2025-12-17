public class insertionsort {

    public static void is(int arr[]){

        // loop 1 
        for(int i = 1 ; i < arr.length ; i++){
            int temp = arr[i];
            int j = i-1;
            for(; j>=0 ;j--){
                if(arr[j]>temp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = temp;
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        is(arr);

        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
            
        }
        
    }
}
