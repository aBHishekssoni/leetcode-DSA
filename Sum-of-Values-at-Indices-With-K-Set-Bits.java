1// class Solution {
2//     public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
3//         if(k==0) return nums.get(0);
4//         int sum=0;
5//         for(int i=0;i<nums.size();i++){
6//             if(hammingWeight(i)==k){
7//                 sum+=nums.get(i);
8//             }
9//         }
10//         return sum;
11//     }
12//         public int hammingWeight(int n) {
13//         if(n==0) return 0;
14//         if(n==1) return 1;
15//         int nums= 0;
16//         while(n>0){
17//             if(n%2!=0) nums++;
18//             n/=2;
19//         }
20//         return nums;
21//     }
22// }
23
24class Solution {
25    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
26        int res=0;
27        for(int i=0;i<nums.size();i++){
28            if(Integer.bitCount(i)==k){
29                res+=nums.get(i);
30            }
31        }
32        return res;
33    }
34}
35