public class movezeroes {
    //!bruteforceeeee
    public static void mz(int arr[]){
        int temp[]=new int [arr.length] ;
        int index = 0 ;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]!=0){
                temp[index] = arr[i]; 
                index++;  
            }
        }
        for(int i = 0 ; i < temp.length ; i++){
            arr[i] = temp[i];
        }

        for(int i = temp.length;i<arr.length ; i++  ){
            arr[i] = 0;
        }

        
    }
    public static void main(String[] args) {
        int arr [] = {0,1,0,3,2};
        mz(arr);
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
