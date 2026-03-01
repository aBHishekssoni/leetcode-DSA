1class Solution {
2    public int findClosest(int x, int y, int z) {
3        if(Math.abs(z-x)>Math.abs(z-y)) return 2;
4        if(Math.abs(z-x)<Math.abs(z-y)) return 1;
5        return 0;
6    }
7}