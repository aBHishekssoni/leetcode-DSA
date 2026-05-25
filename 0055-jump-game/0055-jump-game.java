class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        if(nums[0]==0) return false;
        int a=0;
       for (int i = 0; i < nums.length; i++) {
        if(a<i) return false;
        a = Math.max(a,i+nums[i]);
        if(a>=nums.length-1) return true;
    }
    return true;
    }
}