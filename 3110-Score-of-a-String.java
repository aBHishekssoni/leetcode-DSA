class Solution {
    public int scoreOfString(String s) {
        int a = 0;
        for(int i=1;i<s.length();i++){
             a+= Math.abs(s.charAt(i-1)-s.charAt(i));
        }
        return a;
    }
}