class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int n=0;
        for(int freq : hm.values()){
            if(freq % 2 == 1) n++;
        }
        if(n==0) return s.length();
        return s.length()-n+1;
    }
}