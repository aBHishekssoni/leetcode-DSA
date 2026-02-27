1class Solution {
2    public int theMaximumAchievableX(int num, int t) {
3        if(num>=0) return num+t*2;
4         return num-t*2;
5    }
6}