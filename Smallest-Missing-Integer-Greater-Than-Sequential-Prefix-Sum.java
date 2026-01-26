1class Solution {
2    public int missingInteger(int[] nums) {
3        HashSet<Integer> hs = new HashSet<>();
4        int i,sum=nums[0];
5        //prefix sum liya h
6        for(i=1;i<nums.length;i++){
7            if(nums[i]==nums[i-1]+1) sum+=nums[i];
8            else break;
9        }
10        // check kero ki sum array me hai ya nahi
11        for(i=i-1;i<nums.length;i++){
12            if(sum==nums[i]) break;
13        }
14        //sum data ka sequence check ke liye
15      if(i!=nums.length){  for(i=0;i<nums.length;i++){
16         hs.add(nums[i]);
17        }
18        for( i=0;i<hs.size();i++){
19            sum++;
20            if(!hs.contains(sum)){ break;}
21        }}
22        return sum;
23    }
24}