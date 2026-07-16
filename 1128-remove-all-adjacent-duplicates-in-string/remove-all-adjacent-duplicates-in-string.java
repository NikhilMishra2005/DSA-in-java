class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int size = sb.length();
            
            if (size > 0 && sb.charAt(size - 1) == c) {
                sb.deleteCharAt(size - 1);
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}