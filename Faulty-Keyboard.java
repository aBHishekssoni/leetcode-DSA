1class Solution {
2    public String finalString(String s) {
3       StringBuilder sb = new StringBuilder();
4       for(int i=0;i<s.length();i++){
5        if(s.charAt(i)=='i')
6        sb.reverse();
7        else  sb.append(s.charAt(i));
8       } 
9       return sb.toString();
10    }
11}