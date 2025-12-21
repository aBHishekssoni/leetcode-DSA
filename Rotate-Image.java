1class Solution {
2    public void rotate(int[][] A) {
3        int l=0,r=A.length-1;
4        while(l<r){
5            for(int i=0;i<r-l;i++){
6                int t=l,b=r;
7                int tl=A[t][l+i];
8                A[t][l+i]= A[b-i][l];
9                A[b-i][l]= A[b][r-i];
10                A[b][r-i]= A[t+i][r];
11                A[t+i][r]= tl;
12            }
13            r--;
14            l++;
15        }
16    }
17}