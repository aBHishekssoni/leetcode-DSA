1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        // HashSet<Character> hs = new HashSet<>();
4        ArrayList<Character> ar = new ArrayList<>();
5        int a =0;
6        for(int i=0;i<s.length();i++){
7            if(!ar.contains(s.charAt(i))){
8            ar.add(s.charAt(i));
9            a = Math.max(a, ar.size());
10            }
11            else {
12                while(ar.contains(s.charAt(i)))
13                ar.remove(0);
14            //     hs.clear();
15            // hs.add(s.charAt(i));
16              ar.add(s.charAt(i));
17        }
18    }
19        return a;
20 }
21}