1class Solution {
2    public int smallestNumber(int n) {
3        int pow=2,i=2;
4        while(pow<=n){
5            pow = (int)Math.pow(2,i);
6            i++;
7        }
8        return pow-1;
9    }
10}