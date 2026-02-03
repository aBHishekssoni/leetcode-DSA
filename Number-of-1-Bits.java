1class Solution {
2    public int hammingWeight(int n) {
3        if(n==0) return 0;
4        if(n==1) return 1;
5        int nums= 0;
6        while(n>0){
7            if(n%2!=0) nums++;
8            n/=2;
9        }
10        return nums;
11    }
12}