1class Solution {
2    public int differenceOfSums(int n, int m) {
3        int num1 = (n*(n+1))/2;
4        int num2 =0;
5        for(int i=m;i<=n;i+=m){
6            num2+=i;
7        }
8        return num1-num2*2;
9    }
10}