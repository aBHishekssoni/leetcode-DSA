1class Solution {
2    public String getEncryptedString(String s, int k) {
3        // if(k>=s.length()) return s;
4        k = k%s.length();
5        String st = ""+s.substring(k, s.length());;
6        st = st+s.substring(0, k);
7        return st;
8    }
9}