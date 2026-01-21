1class Solution {
2    public List<Integer> getRow(int rowIndex) {
3        List<Integer> A = new ArrayList<>();
4        long ans =1;
5        A.add((int)ans);
6        rowIndex++;
7        for(int i=1;i<rowIndex;i++){
8            ans = ans *(rowIndex-i);
9            ans = ans/i;
10            A.add((int)ans);
11        }
12     return A;
13    }
14}