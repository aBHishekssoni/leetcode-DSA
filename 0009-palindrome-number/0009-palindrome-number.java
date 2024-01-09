class Solution {
    public boolean isPalindrome(int x) {
      int reversed=0,a=x;
        for(;x != 0; x /= 10) {
      int digit = x % 10;
      reversed = reversed * 10 + digit;
    }
           if(a < 0) return false;
    
        if(a==reversed)  
        return true;

    return false;
    }
}