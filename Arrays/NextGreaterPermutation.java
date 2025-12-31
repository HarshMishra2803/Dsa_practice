package Arrays;
import java.util.*;

public class NextGreaterPermutation {

    public static int[] nextGreaterPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        // Step 1: find the break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: if no breakpoint, reverse whole array
        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return nums;
        }

        // Step 3: find element just greater than A[ind]
        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                swap(nums, i, ind);
                break;
            }
        }

        // Step 4: reverse the right half
        reverse(nums, ind + 1, n - 1);
        return nums;
    }

    // helper swap
    static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // helper reverse
    static void reverse(int[] A, int start, int end) {
        while (start < end) {
            swap(A, start, end);
            start++;
            end--;
        }
    }

    // psvm
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        arr = nextGreaterPermutation(arr);

        System.out.println(Arrays.toString(arr));
    }
}
