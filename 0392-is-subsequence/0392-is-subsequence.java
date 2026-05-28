class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        if(s.equals(t)|| s.length()==0) return true;
        int a =0,c=0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(a)==(t.charAt(i))){
                a++;
                c++;
            } 
            if(c==s.length()) return true;
        }
      
        return false;
    }
}