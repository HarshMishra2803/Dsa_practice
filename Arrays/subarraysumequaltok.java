package Arrays;
class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;

        int cnt = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = 0;

                for (int l = i; l <= j; l++) {
                    sum = sum + nums[l];
                }

                if (sum == k) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt); // Output: 2
    }
}
