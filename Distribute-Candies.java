class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i:candyType){
            hs.add(i);
        }
        if(hs.size()<candyType.length/2){
            return hs.size();
        }
        return candyType.length/2;
    }
}