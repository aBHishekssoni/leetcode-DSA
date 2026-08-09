class Solution {
    public int myAtoi(String s) {
        int n = s.length(),a=0,c=0;
        boolean sign = false;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '&&c==0) continue;
            else if(s.charAt(i)=='-'&&c==0){ sign = true;c++;}
            else if(s.charAt(i)=='+'&&c==0){ sign = false;c++;}
            else if(s.charAt(i)>='0'&& s.charAt(i)<='9'){
                   int digit = s.charAt(i) - '0';
                if (a > (Integer.MAX_VALUE - digit) / 10) {
                    return sign ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                    a*=10;
                    a += (int)s.charAt(i) - 48;
                    c++;
                }
            else if((s.charAt(i)<'0'||s.charAt(i)>'9')) break;
        }
        if(sign ==true) return (a*-1);
        return a;
  }
}