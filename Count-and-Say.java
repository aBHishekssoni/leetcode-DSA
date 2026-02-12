1class Solution {
2    public String countAndSay(int n) {
3        String s = "1"; // start
4        for(int i = 2; i <= n; i++) {
5            StringBuilder ans = new StringBuilder();
6            int count = 1;
7            for(int j = 1; j < s.length(); j++) {
8                if(s.charAt(j) == s.charAt(j-1)) {
9                    count++;
10                }
11                else {
12                    ans.append(count);
13                    ans.append(s.charAt(j-1));
14                    count = 1;
15                }
16            }
17            ans.append(count);
18            ans.append(s.charAt(s.length()-1));
19            s = ans.toString();
20        }
21
22        return s;
23    }
24}