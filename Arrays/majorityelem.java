package Arrays;

public class majorityelem {

    static int majelem(int nums[]){
      
        for(int i = 0 ; i<nums.length ; i++){
            int count = 0;
            for(int j = 0; j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }       
            }
            if(count > nums.length/2){ // moved outside inner loop
                return nums[i];
            }
        }
        return -1;
      
    }



    public static void main(String[] args) {
        int arr[] = {2,2,3,3,1,2,2} ;
        int res =majelem(arr);
        System.out.println(res);
    }
    
}
