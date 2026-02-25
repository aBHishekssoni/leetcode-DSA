1class Solution {
2    public int largestAltitude(int[] gain) {
3        int pf =0,ans=0;
4        for(int i:gain){
5            pf+=i;
6            ans = Math.max(ans,pf);
7        }
8        return ans;
9    }
10}