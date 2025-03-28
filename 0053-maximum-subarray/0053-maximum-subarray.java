class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans = Math.max(sum,ans);
            if(sum<0)
            sum = 0;
        }
        return ans;
    }
}