1class Solution {
2    public String addSpaces(String s, int[] spaces) {
3        StringBuilder sb = new StringBuilder();
4        int prev = 0;
5
6        for(int i = 0; i < spaces.length; i++){
7            sb.append(s.substring(prev, spaces[i]));
8            sb.append(" ");
9            prev = spaces[i];
10        }
11
12        sb.append(s.substring(prev));
13
14        return sb.toString();
15    }
16}