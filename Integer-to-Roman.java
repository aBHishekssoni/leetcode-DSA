1class Solution {
2    public String intToRoman(int num) {
3        String[][] symList = {
4            {"I", "1"}, {"IV", "4"}, {"V", "5"}, {"IX", "9"},
5            {"X", "10"}, {"XL", "40"}, {"L", "50"}, {"XC", "90"},
6            {"C", "100"}, {"CD", "400"}, {"D", "500"}, {"CM", "900"},
7            {"M", "1000"}
8        };
9
10        StringBuilder res = new StringBuilder();
11
12        // Traverse from largest to smallest value
13        for (int i = symList.length - 1; i >= 0; i--) {
14            String sym = symList[i][0];
15            int val = Integer.parseInt(symList[i][1]);
16
17            if (num >= val) {
18                int count = num / val;
19                for (int j = 0; j < count; j++) {
20                    res.append(sym);
21                }
22                num %= val;
23            }
24        }
25
26        return res.toString();
27    }
28}
29