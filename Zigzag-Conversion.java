1class Solution {
2    public String convert(String s, int numRows) {
3        if(numRows==1) return s;
4        String res = "";
5        for(int r=0;r<numRows;r++){
6            int incr = 2*(numRows-1);
7            for(int i=r;i<s.length();i+=incr){
8                res+=s.charAt(i);
9                if(r>0&&r<numRows-1&&i+incr-2*r<s.length())
10                res+=s.charAt(i+incr-2*r);
11            }
12        }
13        return res;
14    }
15}