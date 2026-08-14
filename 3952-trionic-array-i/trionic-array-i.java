class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 0;

        // Increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // Must have increasing part
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Decreasing
        int start = i;
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }

        // Must have decreasing part
        if (i == start || i == n - 1) {
            return false;
        }

        // Increasing again
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}