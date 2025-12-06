1class Solution {
2    public int pivotInteger(int n) {
3  int total = n * (n + 1) / 2;
4        int x = (int)Math.sqrt(total);
5        if (x * x == total) return x;
6        return -1;
7    }
8}