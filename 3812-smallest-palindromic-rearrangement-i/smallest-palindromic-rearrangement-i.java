class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        char[] half = s.substring(0, n / 2).toCharArray();
        java.util.Arrays.sort(half);
        
        String sortedHalf = new String(half);
        String middle = (n % 2 == 1) ? String.valueOf(s.charAt(n / 2)) : "";
        String reversedHalf = new StringBuilder(sortedHalf).reverse().toString();

        return sortedHalf + middle + reversedHalf;
    }
}