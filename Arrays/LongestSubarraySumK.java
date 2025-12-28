package Arrays;
import java.util.*;

public class LongestSubarraySumK {
    

    public static int longestSubarrayWithSumK(int[] a, long k) {

        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for(int i = 0; i < a.length; i++) {

            sum += a[i];

            // Case 1: whole array from 0 to i equals k
            if(sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Case 2: Check if (sum - k) seen before
            long rem = sum - k;
            if(preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Store sum first time only
            if(!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, -1, 1, 1, 4, 2, 3, 3};
        long k = 3;
        System.out.println(longestSubarrayWithSumK(arr, k)); // Output: 4
    }
}
