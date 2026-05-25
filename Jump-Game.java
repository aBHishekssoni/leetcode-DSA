1class Solution {
2    public boolean canJump(int[] nums) {
3        if(nums.length==1) return true;
4        if(nums[0]==0) return false;
5        int a=0;
6       for (int i = 0; i < nums.length; i++) {
7        if(a<i) return false;
8        a = Math.max(a,i+nums[i]);
9        if(a>=nums.length-1) return true;
10    }
11    return true;
12    }
13}