class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        
        // Iterate through each character in the string
        for (char c : n.toCharArray()) {
            int digit = c - '0';  // Convert char to int
            
            // Track the maximum digit found
            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }
        
        return maxDigit;
    }
}