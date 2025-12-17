package Basics;
public class twosum {

    // Non-static method
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // Static main method
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Create object because twoSum is non-static
        twosum ts = new twosum();

        // Call the method and store result
        int[] result = ts.twoSum(nums, target);

        // Print result
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
