class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> A = new HashMap<Integer,Integer>();
        for(int i: nums){
             A.put(i, A.getOrDefault(i, 0) + 1);
        }
        for(int i: nums){
            if(A.get(i)>nums.length/2){
                return i;
            }
        }
        return -1;
    }
}