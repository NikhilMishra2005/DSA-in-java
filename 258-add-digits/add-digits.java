class Solution {
    public int addDigits(int num) { 
        if(num==0){
            return 0;
        }
        return (num %9 ==0)?9:num%9;
     //if number is completely divisible by 9 then we return sum of digits of that number otherwise we simply addd the digits and return the sum of that particular number   
    }
}