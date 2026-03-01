1class Solution {
2    public String reversePrefix(String s, int k) {
3        String a = "";
4        for(int i=0;i<s.length();i++){
5            if(i<k) a = s.charAt(i)+a;
6            else a += s.charAt(i);
7        }
8        return a;
9    }
10}