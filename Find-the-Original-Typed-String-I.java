1class Solution {
2    public int possibleStringCount(String word) {
3        int ans = 1;
4        for(int i=1;i<word.length();i++){
5            if(word.charAt(i)==word.charAt(i-1))
6                ans++;
7        }
8        return ans;
9    }
10}