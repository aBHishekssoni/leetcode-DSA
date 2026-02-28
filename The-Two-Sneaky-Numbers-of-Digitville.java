1class Solution {
2    public int[] getSneakyNumbers(int[] nums) {
3      int[] get = new int[2];
4      HashSet<Integer> hs = new HashSet<>();
5      int n=0;
6      for(int i:nums){
7        if(hs.contains(i)){
8            get[n] = i;
9            n++;
10        }
11        if(n==2) return get;
12        hs.add(i);
13      }  
14      return get;
15    }
16}