class Solution {
    public int sumOfUnique(int[] nums) {
        // Frequency array to store counts for numbers from 1 to 100
        int[] count = new int[101]; 
        
        // Count the occurrences of each number
        for (int num : nums) {
            count[num]++;
        }
        
        int sum = 0;
        // Sum numbers that appeared exactly once
        for (int i = 1; i <= 100; i++) {
            if (count[i] == 1) {
                sum += i;
            }
        }
        
        return sum;
    }
}