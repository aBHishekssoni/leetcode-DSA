class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,sum=0;
        // if(nums[0]==1){
        //     sum=1;
        //     max=1;
        // }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum++;
            }
            else if(nums[i]==0){
                max = Math.max(max,sum);
                sum=0;
            }
            
        }
         max = Math.max(max,sum);
         return max;
    }
}