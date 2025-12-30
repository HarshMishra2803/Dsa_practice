package Arrays;

public class rearangesign {

    public static int[] rs(int nums[]){
        int n = nums.length;
        int ans[] = new int[n];
        int posindex = 0, negindex = 1;

        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                ans[negindex] = nums[i];
                negindex += 2;
            } else {
                ans[posindex] = nums[i];
                posindex += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,-2,3,-1,-2,7};
        int result[] = rs(arr);

        // print output
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
