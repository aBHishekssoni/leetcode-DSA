1class Solution {
2    public String getEncryptedString(String s, int k) {
3        k = k%s.length();
4        String st = ""+s.substring(k, s.length());;
5        st = st+s.substring(0, k);
6        return st;
7    }
8}