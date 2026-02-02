class Solution {

    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int low, int high) {

        // Base case
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        // Left half
        if (nums[mid] > target) {
            return binarySearch(nums, target, low, mid - 1);
        }
        // Right half
        else {
            return binarySearch(nums, target, mid + 1, high);
        }
    }
}
