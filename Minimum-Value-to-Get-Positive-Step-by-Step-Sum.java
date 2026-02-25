1class Solution {
2    public int minStartValue(int[] nums) {
3        int minneg = 0,sum=0;
4        for(int i:nums){
5            sum+=i;
6            if(sum<0) minneg = Math.min(sum,minneg);
7        }
8        minneg = Math.abs(minneg);
9        return minneg+1;
10    }
11}