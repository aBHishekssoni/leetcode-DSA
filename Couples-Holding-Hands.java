1class Solution {
2    public int minSwapsCouples(int[] row) {
3        int n = row.length;
4        int[] pos = new int[n];
5        for (int i = 0; i < n; i++) pos[row[i]] = i;
6        int swaps = 0;
7        for (int i = 0; i < n; i += 2) {
8            int x = row[i];
9            int partner = x ^ 1;
10            if (row[i + 1] != partner) {
11                swaps++;
12                int partnerPos = pos[partner];
13                pos[row[i + 1]] = partnerPos;
14                row[partnerPos] = row[i + 1];
15                row[i + 1] = partner;
16                pos[partner] = i + 1;
17            }
18        }
19        return swaps;
20    }
21}