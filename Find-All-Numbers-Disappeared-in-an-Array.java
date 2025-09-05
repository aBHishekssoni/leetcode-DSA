class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> A = new HashSet<>();
        for(int i: nums)
        A.add(i);
        List<Integer> b = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!A.contains(i))
            b.add(i);
        }
        return b;
    }
}