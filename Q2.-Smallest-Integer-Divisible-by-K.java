1class Solution {
2    public int smallestRepunitDivByK(int k) {
3        if(k%2==0||k%5==0) return -1;
4        int rem = 0;
5        for (int length = 1; length <= k; length++) {
6            rem = (rem * 10 + 1) % k;
7            if (rem == 0) return length;
8        }
9            return -1;
10    }
11}