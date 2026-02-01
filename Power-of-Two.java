1class Solution {
2    public int reverse(int x) {
3        int rev = 0;
4        while (x != 0) {
5            int pop = x % 10;
6            x /= 10; 
7            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7)) {
8                return 0;
9            }
10            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8)) {
11                return 0; 
12            }
13            
14            rev = rev * 10 + pop;
15        }
16        return rev;
17    }
18}
19