1class Solution {
2    public String longestPalindrome(String s) {
3        String res = "";
4        int reslen = 0;
5        for(int i=0;i<s.length();i++){
6            //odd length ke liye 
7            int l=i,r=i;
8            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
9                if(r-l+1>reslen){
10                    res = s.substring(l, r + 1);
11                    reslen = r-l+1;
12                }
13                l-=1;
14                r+=1;
15            }
16            //even length ke liye 
17             l=i;
18             r=i+1;
19            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
20                if(r-l+1>reslen){
21                    res = s.substring(l, r + 1);
22                    reslen = r-l+1;
23                }
24                l-=1;
25                r+=1;
26            }
27        }
28        return res;
29    }
30}