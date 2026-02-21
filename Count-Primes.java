1class Solution {
2    public int countPrimes(int n) {
3        if(n <= 2) return 0;
4
5        boolean[] t = new boolean[n];
6        Arrays.fill(t, true);
7
8        t[0] = false;
9        t[1] = false;
10
11        for(int i = 2; i * i < n; i++){
12            if(t[i]) {
13                for(int j = i * i; j < n; j += i){
14                    t[j] = false;
15                }
16            }
17        }
18
19        int c = 0;
20        for(int i = 2; i < n; i++){
21            if(t[i]) c++;
22        }
23
24        return c;
25    }
26}