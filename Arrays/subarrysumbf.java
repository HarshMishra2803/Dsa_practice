package Arrays;

public class subarrysumbf {
    static void ssbf(int arr[]){
        int len = 0 ; 
        for(int i = 0  ; i < arr.length;i++){
            for(int j = i ; j< arr.length ; j++){    

                int sum = 0 ;
                
                
                for(int k = i ; k<=j ;k++){
                    sum = sum+arr[k];
                    if(sum==k){
                        len = Math.max(len,j-i+1);
                    }
                }
            }       
        }
        System.out.println(len);
    }
    public static void main(String[] args) {
        int arr [] = {10, 5, 2, 7, 1, 9} ;
        ssbf(arr);
    }
}
