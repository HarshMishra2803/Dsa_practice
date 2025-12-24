package Arrays;

public class singlenumber {

    static void sn(int arr[]){       
        for(int i = 0 ; i< arr.length ;i++){
            int counter = 0 ;
            for(int j = 0 ; j<arr.length ;j++){
                if(arr[i]==arr[j]){
                    counter++;
                }
            }
            if(counter == 1){
                System.out.println(arr[i]);
            }
        }        
    }
    
    public static void main(String[] args) {
        
        int arr [] = {2,2,1 };
        sn(arr);
    }
    
}
