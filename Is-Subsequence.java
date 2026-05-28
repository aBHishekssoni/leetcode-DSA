1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        if(s.length()>t.length()) return false;
4        if(s.equals(t)|| s.length()==0) return true;
5        int a =0,c=0;
6        for(int i=0;i<t.length();i++){
7            if(s.charAt(a)==(t.charAt(i))){
8                a++;
9                c++;
10            } 
11            if(c==s.length()) return true;
12        }
13      
14        return false;
15    }
16}