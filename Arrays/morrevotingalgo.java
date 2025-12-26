package Arrays;

public class morrevotingalgo {

    static int mva(int nums[]){
        int count = 0 ; int elem = 0;
        for ( int i = 0 ;i<nums.length ;i++){

            if(count ==0){
                count = 1 ;
                elem = nums[i];
            }else if(nums[i]==elem){
                count++;
            }
            else{
                count--;
            }
        }
        int counter1 = 0 ; 
        for(int i =0 ; i < nums.length ;i++){
            if(nums[i]==elem){
                counter1++;
            }
        }
        if(counter1 > ( nums.length/2)){
            return elem;
        }

        return -1;


    }
    public static void main(String[] args) {
        
        int arr [] = {2,2,1,3,1,1,3,1,1} ;
        int res =mva(arr);
        System.out.println(res);
    }
}
