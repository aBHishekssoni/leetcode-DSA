1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            // if(nums[i]>0){
5                nums[i] = nums[i]*nums[i];
6            // }else nums[i] = 0;
7        }
8        Arrays.sort(nums);
9        return nums;
10    }
11}