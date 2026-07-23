class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        
        for (int i = left; i <= right; i++) {
            int setBits = Integer.bitCount(i);
            if (isPrime(setBits)) {
                count++;
            }
        }
        
        return count;
    }

    private boolean isPrime(int n) {
        return n == 2 || n == 3 || n == 5 || n == 7 || 
               n == 11 || n == 13 || n == 17 || n == 19;
    }
}