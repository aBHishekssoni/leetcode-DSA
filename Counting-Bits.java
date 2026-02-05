1class Solution {
2    public int[] countBits(int n) {
3        int[] arr = new int[n+1];
4        for(int i = 1; i<=n;i++){
5            arr[i] = hammingWeight(i);
6        }
7        return arr;
8    }
9        public int hammingWeight(int n) {
10        if(n==0) return 0;
11        if(n==1) return 1;
12        int nums= 0;
13        while(n>0){
14            if(n%2!=0) nums++;
15            n/=2;
16        }
17        return nums;
18    }
19}