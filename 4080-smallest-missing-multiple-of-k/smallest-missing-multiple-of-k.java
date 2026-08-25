import java.util.HashSet;
import java.util.Set;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        // Step 1: Store all elements of nums in a HashSet for O(1) lookups
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // Step 2: Check multiples of k starting from 1 * k, 2 * k, ...
        int currentMultiple = k;
        while (set.contains(currentMultiple)) {
            currentMultiple += k;
        }
        
        // Step 3: Return the first multiple not present in the set
        return currentMultiple;
    }
}