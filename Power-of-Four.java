1class Solution {
2    public boolean isPowerOfFour(int n) {
3       if(n==1) return true;
4        if(n>0&&n%4==0)
5        return isPowerOfFour(n/4);
6        return false;    
7    }
8}