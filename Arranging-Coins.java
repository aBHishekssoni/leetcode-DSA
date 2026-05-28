1class Solution {
2    public int arrangeCoins(int n) {
3      return (int)((-1 + Math.sqrt(1 + 8.0 * n)) / 2);
4    }
5}