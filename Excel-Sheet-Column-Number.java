1class Solution {
2    public int titleToNumber(String columnTitle) {
3        int n =0;
4        if(columnTitle=="") return n;
5        for(int i=0;i<columnTitle.length();i++){
6        // for(char ch : columnTitle){
7            n*=26;
8            n +=((int)columnTitle.charAt(i)-64); 
9        }
10        return n;
11    }
12}