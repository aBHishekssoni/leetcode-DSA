1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int[] arr = new int[nums.length*2];
4        int n=0;
5        for(int i=0;i<nums.length;i++){
6            arr[i] = nums[i];
7            n++;
8        }
9        for(int i=nums.length-1;i>=0;i--){
10            arr[n] = nums[i];
11            n++;
12        }
13        return arr;
14    }
15}