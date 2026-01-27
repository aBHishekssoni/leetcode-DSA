1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        HashSet<Integer> A = new HashSet<>();
4        for(int i: nums)
5        A.add(i);
6        List<Integer> b = new ArrayList<>();
7        for(int i=1;i<=nums.length;i++){
8            if(!A.contains(i))
9            b.add(i);
10        }
11        return b;
12    }
13}