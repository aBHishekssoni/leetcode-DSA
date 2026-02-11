1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()) return false;
4       int[] freq = new int[26]; // for lowercase letters
5
6        // Count s
7        for (int i = 0; i < s.length(); i++) {
8            freq[s.charAt(i) - 'a']++;
9        }
10
11        // Subtract using t
12        for (int i = 0; i < t.length(); i++) {
13            freq[t.charAt(i) - 'a']--;
14
15            if (freq[t.charAt(i) - 'a'] < 0)
16                return false;
17        }
18        return true;
19    }
20}