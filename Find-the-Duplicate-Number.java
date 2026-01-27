1class Solution {
2    public int findDuplicate(int[] nums) {
3        HashSet<Integer> hs = new HashSet<>();
4        for(int i:nums){
5            if(hs.contains(i)) return i;
6            else hs.add(i);
7        }
8        return -1;
9    }
10}