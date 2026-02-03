1class Solution {
2    public boolean isPowerOfThree(int n) {
3       if(n==1) return true;
4        if(n>0&&n%3==0)
5        return isPowerOfThree(n/3);
6        return false;  
7    }
8}