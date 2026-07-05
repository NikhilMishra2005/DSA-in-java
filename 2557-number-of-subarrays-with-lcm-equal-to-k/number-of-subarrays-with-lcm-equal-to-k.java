class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int currentLcm = nums[i];
            
            for (int j = i; j < nums.length; j++) {
                currentLcm = lcm(currentLcm, nums[j]);
                
                if (currentLcm == k) {
                    count++;
                } else if (currentLcm > k) {
                    break;
                }
            }
        }
        
        return count;
    }
    
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}