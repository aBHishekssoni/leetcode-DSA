class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr = new int[nums.length*2];
        int n=0;
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
            n++;
        }
        for(int i=nums.length-1;i>=0;i--){
            arr[n] = nums[i];
            n++;
        }
        return arr;
    }
}