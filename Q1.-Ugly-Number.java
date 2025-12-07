1class Solution {
2    public boolean isUgly(int n) {
3        if (n <= 0) return false;
4
5        while (n % 2 == 0) n /= 2;
6        while (n % 3 == 0) n /= 3;
7        while (n % 5 == 0) n /= 5;
8
9        return n == 1;
10    }
11}
12