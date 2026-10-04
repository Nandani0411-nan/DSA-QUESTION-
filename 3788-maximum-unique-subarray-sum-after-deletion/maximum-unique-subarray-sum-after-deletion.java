import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxSum(int[] nums) {
        int mx = Integer.MIN_VALUE;
        for (int num : nums) {
            mx = Math.max(mx, num);
        }
        
        // If all numbers are negative or zero, return the maximum single element
        if (mx <= 0) {
            return mx;
        }
        
        Set<Integer> seen = new HashSet<>();
        int totalSum = 0;
        
        for (int x : nums) {
            // Skip negative numbers and duplicates
            if (x < 0 || seen.contains(x)) {
                continue;
            }
            totalSum += x;
            seen.add(x);
        }
        
        return totalSum;
    }
}