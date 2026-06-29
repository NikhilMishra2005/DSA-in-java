class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open == 0) continue;
                open--;
            }
            sb.append(c);
        }
        
        StringBuilder result = new StringBuilder();
        int close = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (c == ')') {
                close++;
            } else if (c == '(') {
                if (close == 0) continue;
                close--;
            }
            result.append(c);
        }
        
        return result.reverse().toString();
    }
}