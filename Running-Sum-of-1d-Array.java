1class Solution {
2    public int[] runningSum(int[] nums) {
3        // int pf=0;
4        for(int i=1;i<nums.length;i++){
5            // pf+=nums[i];
6            nums[i]+= nums[i-1];
7        }
8        return nums;
9    }
10}