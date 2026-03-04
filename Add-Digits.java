1class Solution {
2    public int addDigits(int num) {
3        int n=0;
4        while(true){
5            n+=num%10;
6            num/=10;
7            if(n<10&&num==0) return n;
8            if(num==0){
9                num = n;
10                n=0;
11            }
12        }
13    }
14}