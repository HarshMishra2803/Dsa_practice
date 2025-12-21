import java.util.*;

public class RemoveDuplicates1 {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        // Set to remove duplicates (order maintain)
        Set<Integer> set = new LinkedHashSet<>();

        // Add elements to set
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // Copy unique elements back to array
        int index = 0;
        for (int val : set) {
            nums[index] = val;
            index++;
        }

        return set.size();
    }

    // psvm
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3};

        int k = removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
