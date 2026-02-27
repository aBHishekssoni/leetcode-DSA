1class Solution {
2    public boolean isThree(int n) {
3        int c=0;
4        for(int i=2;i<n;i++){
5            if(n%i==0) c++;
6            if(c>1) return false;
7        }if(c==0) return false;
8        return true;
9    }
10}