1class Solution {
2    public int countSegments(String s) {
3        if(s.length()==0) return 0;
4        // if(s.length()==1) return 1;
5        int c=0;
6        for(int i=0;i<s.length();i++){
7             if(s.charAt(i) != ' ' &&
8              (i == 0 || s.charAt(i-1) == ' '))
9            c++;
10        }
11        return c;
12    }
13}