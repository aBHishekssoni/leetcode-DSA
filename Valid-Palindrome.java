1class Solution {
2    public boolean isPalindrome(String s) {
3        int l = 0, r = s.length() - 1;
4
5        while (l < r) {
6            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
7                l++;
8            }
9            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
10                r--;
11            }
12
13            if (Character.toLowerCase(s.charAt(l)) !=
14                Character.toLowerCase(s.charAt(r))) {
15                return false;
16            }
17
18            l++;
19            r--;
20        }
21        return true;
22    }
23}
24