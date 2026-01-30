1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        ArrayList<Character> ar = new ArrayList<>();
4        int a =0;
5        for(int i=0;i<s.length();i++){
6            if(!ar.contains(s.charAt(i))){
7            ar.add(s.charAt(i));
8            a = Math.max(a, ar.size());
9            }
10            else {
11                while(ar.contains(s.charAt(i)))
12                ar.remove(0);
13
14              ar.add(s.charAt(i));
15        }
16    }
17        return a;
18 }
19}