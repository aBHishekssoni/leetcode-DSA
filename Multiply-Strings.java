1class Solution {
2    public String multiply(String num1, String num2) {
3        if(num1.equals("0") || num2.equals("0")) return "0";
4
5        int m = num1.length();
6        int n = num2.length();
7
8        int[] result = new int[m + n];
9
10        for(int i = m - 1; i >= 0; i--) {
11            for(int j = n - 1; j >= 0; j--) {
12
13                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
14
15                int sum = mul + result[i + j + 1];
16
17                result[i + j + 1] = sum % 10;      // digit
18                result[i + j] += sum / 10;         // carry
19            }
20        }
21
22        StringBuilder sb = new StringBuilder();
23
24        for(int num : result) {
25            if(!(sb.length() == 0 && num == 0)) {
26                sb.append(num);
27            }
28        }
29
30        return sb.toString();
31    }
32}