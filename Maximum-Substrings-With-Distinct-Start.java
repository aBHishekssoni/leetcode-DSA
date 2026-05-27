1class Solution {
2    public int maxDistinct(String s) {
3        HashSet<Character> hs = new HashSet<>();
4        for(int i=0;i<s.length();i++){
5            char ch = s.charAt(i);
6            hs.add(ch);
7        }
8        return hs.size();
9    }
10}