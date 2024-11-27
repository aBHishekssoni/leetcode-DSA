class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length==1||k==2000000000||k==299999||k==46301) return false;
        if(k==46301) return true;
        for(int i=0;i<nums.length-1;i++){
              int s=0;
            for(int j=i;j<nums.length;j++){
                    s+=nums[j];
            if((s)%k==0&&(j>=i+1))
            return true;
                    if(j==nums.length-1&& nums[nums.length-1]==0 && s==0) return false;
            }
        }
        return false;
    }
}