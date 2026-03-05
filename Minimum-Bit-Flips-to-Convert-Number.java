1class Solution {
2    public int minBitFlips(int start, int goal) {
3        int ans = start^goal,n=0;
4        while(ans!=0){
5            if((ans&1)==1) n++;
6            ans=ans>>1;
7
8        }
9        return n;
10    }
11}