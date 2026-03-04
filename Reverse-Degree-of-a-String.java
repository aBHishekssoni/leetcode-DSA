1class Solution {
2    public int reverseDegree(String s) {
3        int n=0,c=1;
4        for(char i: s.toCharArray()){
5            n+= Math.abs(123-i)*c;
6            c++;
7        }
8        return n;
9    }
10}