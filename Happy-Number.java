1class Solution {
2    public boolean isHappy(int n) {
3        while (n != 1) {
4            int sum = 0;
5
6            while (n > 0) {
7                int digit = n % 10;
8                sum += digit * digit;
9                n /= 10;
10            }
11
12            n = sum;
13
14            // All unhappy numbers eventually fall into this loop
15            if (n == 4) return false;
16        }
17        return true;
18    }
19}