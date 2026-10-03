class Solution {
    public int firstUniqChar(String s) {
        // Array to store the frequency of each character (a-z)
        int[] freq = new int[26];
        
        // First pass: count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        // Second pass: find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        // Return -1 if no unique character exists
        return -1;
    }
}