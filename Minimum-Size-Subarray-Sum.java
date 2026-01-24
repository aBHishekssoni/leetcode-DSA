1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int l=0,sum=0;
4        int res = Integer.MAX_VALUE;
5        for(int i=0;i<nums.length;i++){
6            sum+= nums[i];
7            while(sum>=target){
8            res= Math.min(res,i-l+1);
9            sum-=nums[l];
10            l+=1;
11            }
12        }
13        if(res==Integer.MAX_VALUE)
14    return 0;
15    return res;
16    }
17}