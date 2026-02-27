1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int max=0;
4        for(int i:nums) max +=i;
5        return max%k;
6    }
7}