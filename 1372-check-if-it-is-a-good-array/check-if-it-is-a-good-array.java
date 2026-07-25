class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcdVal = nums[0];
        for (int num : nums) {
            gcdVal = gcd(gcdVal, num);
            if (gcdVal == 1) {
                return true;
            }
        }
        return gcdVal == 1;
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