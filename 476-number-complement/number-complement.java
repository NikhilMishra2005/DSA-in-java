class Solution {
    public int findComplement(int num) {
        int marks = 1;
        while(marks< num){
            marks = (marks << 1) |1;
                    }
                    return marks ^ num;
        
    }
}