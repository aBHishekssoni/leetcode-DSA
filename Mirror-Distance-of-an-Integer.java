1class Solution {
2    public int mirrorDistance(int n) {
3        // String s = ""+n;
4        int k=n;
5        int a = 0;
6        while(n!=0){
7            a*=10;
8            a+=n%10;
9            n/=10;
10        }
11    return Math.abs(k-a);
12    }
13}