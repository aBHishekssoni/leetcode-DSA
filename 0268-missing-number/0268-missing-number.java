class Solution {
    public int missingNumber(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            a+= nums[i];
        }
        return (nums.length*(nums.length+1)/2)-a;
    }
}