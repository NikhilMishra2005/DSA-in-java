class Solution {
    public int minFlips(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        sb.append(s);
        String doubled = sb.toString();

        StringBuilder alt1 = new StringBuilder();
        StringBuilder alt2 = new StringBuilder();

        for (int i = 0; i < doubled.length(); i++) {
            alt1.append(i % 2 == 0 ? '0' : '1');
            alt2.append(i % 2 == 0 ? '1' : '0');
        }

        int diff1 = 0;
        int diff2 = 0;
        int minFlips = Integer.MAX_VALUE;

        int left = 0;
        for (int right = 0; right < doubled.length(); right++) {
            if (doubled.charAt(right) != alt1.charAt(right)) {
                diff1++;
            }
            if (doubled.charAt(right) != alt2.charAt(right)) {
                diff2++;
            }

            if (right - left + 1 > n) {
                if (doubled.charAt(left) != alt1.charAt(left)) {
                    diff1--;
                }
                if (doubled.charAt(left) != alt2.charAt(left)) {
                    diff2--;
                }
                left++;
            }

            if (right - left + 1 == n) {
                minFlips = Math.min(minFlips, Math.min(diff1, diff2));
            }
        }

        return minFlips;
    }
}