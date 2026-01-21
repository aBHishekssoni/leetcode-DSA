1class Solution {
2    public String convertToTitle(int columnNumber) {
3        String s ="";
4        if(columnNumber<=26){
5          char a= (char)(columnNumber+64);
6          s+=a;
7          return s;
8        } 
9        while(columnNumber>0){
10            columnNumber--;
11            int n = columnNumber%26;
12            columnNumber-=n;
13            // if(n==0) s = "Z"+s;
14            // else
15            s = (char)(n+65)+s;
16            columnNumber /=26;
17        }
18        return s;
19    }
20}