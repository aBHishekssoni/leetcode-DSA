1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        //  List<Integer> ans = new ArrayList<>();
4
5        
6        if(s2.length() < s1.length()) return false;
7
8        int[] pCount = new int[26];
9        int[] sCount = new int[26];
10
11        // p ka frequency count
12        for(char c : s1.toCharArray()){
13            pCount[c - 'a']++;
14        }
15
16        int windowSize = s1.length();
17
18        for(int i = 0; i < s2.length(); i++){
19            
20            // current character add karo
21            sCount[s2.charAt(i) - 'a']++;
22
23            // agar window size exceed ho gaya
24            if(i >= windowSize){
25                sCount[s2.charAt(i - windowSize) - 'a']--;
26            }
27
28            // check karo dono arrays same hai kya
29            if(Arrays.equals(pCount, sCount)){
30               return true;
31            }
32        }
33
34        return false;
35    }
36}