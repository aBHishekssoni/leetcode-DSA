1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0)
4        return false;
5        int n = x;
6        int a=0;
7        while(n>0){
8            a *=10;
9            a += n%10;
10            n /=10;
11        }
12        if(a==x) return true;
13        return false;
14    }
15}