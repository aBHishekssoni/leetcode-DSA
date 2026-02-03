1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n==1) return true;
4        if(n>0&&n%2==0)
5        return isPowerOfTwo(n/2);
6        return false;
7    }
8}