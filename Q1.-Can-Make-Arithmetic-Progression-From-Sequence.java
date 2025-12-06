1class Solution {
2    public boolean canMakeArithmeticProgression(int[] arr) {
3        if(arr.length<2)
4        return true;
5        Arrays.sort(arr);
6        int d=arr[1]-arr[0];
7        for(int i=1;i<arr.length;i++){
8            if(d!=arr[i]-arr[i-1])
9            return false;
10        }
11        return true;
12    }
13}