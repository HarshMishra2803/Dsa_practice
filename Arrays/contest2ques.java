package Arrays;

public class contest2ques {

    public static int minLength(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int count = 0 ;
        for ( int i = 0 ; i< n-1 ;i++){

            if(nums[i]!=nums[i+1]){
                sum = sum + nums[i];
               count++;
            }
            
            if(sum ==k){
                return count;
            }
        }
        return -1;    
    }
    public static void main(String[] args) {
        int nums [] = {2,2,3,1};
        int k = 5;
        int res = minLength(nums,k);
        System.out.println(res);
    }



    
}
