1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int[] n= new int[2];
4        HashSet<Integer> hs = new HashSet<>();
5        for(int i:nums){
6            if(hs.contains(i)){
7                n[0] =i;
8                // break;
9            }
10            else hs.add(i);
11        }
12        // int a=1;
13        for(int i=1;i<=nums.length;i++){
14            if(!hs.contains(i)){
15            // if(nums[i]!=a){
16                n[1] =i;
17                break;
18            }
19        }
20        return n;
21    }
22}