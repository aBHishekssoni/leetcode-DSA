1class Solution {
2    public int[] transformArray(int[] nums) {
3        int n =0;
4        for(int i =0;i<nums.length;i++){
5          if(nums[i]%2==0)  n++;
6        }
7        for(int i =0;i<nums.length;i++){
8            if(n>i) nums[i] = 0;
9            else nums[i]= 1;
10        }
11
12        // Arrays.sort(nums);
13        return nums;
14    }
15}