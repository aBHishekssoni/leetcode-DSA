1class Solution {
2    public int alternatingSum(int[] nums) {
3        int n=0;
4        for(int i=0;i<nums.length;i++){
5            if(i%2==0) n+=nums[i];
6            else n-= nums[i];
7        }
8        return n;
9    }
10}