1class Solution {
2    public int lengthOfLastWord(String s) {
3        int n=0;
4        for(int i=s.length()-1;i>=0;i--){
5            if(s.charAt(i)==' '&&n!=0) break;
6            else if(s.charAt(i)==' ') continue;
7            n++;
8        }
9        return n;
10    }
11}