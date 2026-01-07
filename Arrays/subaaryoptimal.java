package Arrays;
import java.util.HashMap;

public class subaaryoptimal {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int preSum = 0, cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            cnt += map.getOrDefault(preSum - k, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int k = 6;
        System.out.println(subarraySum(nums, k));
    }
}
