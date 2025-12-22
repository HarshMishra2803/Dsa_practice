package Arrays;
public class movezeroes2 {
    //! optimallllllllla approach
    static void mz2(int arr [] ){

        // step 1 ; 
        int j = -1 ; 
        for ( int i = 0 ; i< arr.length ; i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if (j == -1) return;

        for(int i = j+1 ; i<arr.length ; i++){
            if(arr[i]!=0){
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp ;
                j++;
            }
        }

    }
    public static void main(String[] args) {
        
        int arr [] = {1,0,2,3,2,0,0,4,5,1} ;
        mz2(arr);
        for ( int k = 0 ; k<arr.length ;k++){
            System.out.print(arr[k]+ " ");
        }
    }

}
