1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int j = 0;
4
5        for(int i = 0; i < typed.length(); i++){
6            if(j < name.length() && typed.charAt(i) == name.charAt(j))
7                j++;
8            else if(i > 0 && typed.charAt(i) == typed.charAt(i-1))
9                continue;
10            else
11                return false;
12        }
13
14        return j == name.length();
15    }
16}