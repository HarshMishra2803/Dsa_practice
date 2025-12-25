package Arrays;

public class sortcolor {

    static void sort ( int nums [] ){
        
        for ( int i = 0; i<nums.length ; i++){

            if(nums[i]> nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }else{
                j++;
            }

        }
    }
    
    public static void main(String[] args) {
        int nums [] = {4,5,6,3} ;
        sort(nums);

        for ( int i = 0 ; i< nums.length ;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
