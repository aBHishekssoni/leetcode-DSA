1// class Solution {
2//     public String fractionToDecimal(int numerator, int denominator) {\
3//        if (numerator == 0) return "0";
4//         double a = numerator;
5//         double b = denominator;
6//         String s= "";
7//         if(numerator%denominator!=0)
8//          s = ""+a/b;
9//         else 
10//             s = ""+numerator/denominator;
11//         return s;
12//     }
13// }
14class Solution {
15    public String fractionToDecimal(int numerator, int denominator) {
16        if (numerator == 0) return "0";
17
18        StringBuilder res = new StringBuilder();
19        if ((numerator < 0) ^ (denominator < 0)) res.append('-');
20
21        long n = Math.abs((long) numerator);
22        long d = Math.abs((long) denominator);
23
24        res.append(n / d);
25        long rem = n % d;
26        if (rem == 0) return res.toString();
27
28        res.append('.');
29        Map<Long, Integer> seen = new HashMap<>();
30
31        while (rem != 0) {
32            if (seen.containsKey(rem)) {
33                int pos = seen.get(rem);
34                res.insert(pos, "(");
35                res.append(')');
36                break;
37            }
38            seen.put(rem, res.length());
39            rem *= 10;
40            res.append(rem / d);
41            rem = rem % d;
42        }
43        return res.toString();
44    }
45}