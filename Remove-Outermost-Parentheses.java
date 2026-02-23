1class Solution {
2    public String removeOuterParentheses(String s) {
3      StringBuilder str = new StringBuilder();
4        int depth = 0;
5
6        for(int i = 0; i < s.length(); i++){
7            char ch = s.charAt(i);
8
9            if(ch == '('){
10                if(depth > 0) str.append(ch);
11                depth++;
12            } 
13            else {
14                depth--;
15                if(depth > 0) str.append(ch);
16            }
17        }
18        return str.toString();
19    }
20}