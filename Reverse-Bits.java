1class Solution {
2    public int reverseBits(int n) {
3        int ans=0;
4        for(int i=0;i<32;i++){
5            ans = ans|((1&(n>>i))<<31-i);
6        }
7        return ans;
8    }
9}