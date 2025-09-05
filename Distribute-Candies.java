class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i:candyType)
            hs.add(i);
        return Math.min(hs.size(),candyType.length/2);
    }
}