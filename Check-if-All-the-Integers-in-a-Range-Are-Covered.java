1class Solution {
2    public boolean isCovered(int[][] ranges, int left, int right) {
3
4        label: for (int i = left; i <= right; i++) {
5
6            for (int[] range : ranges) {
7
8                if (i >= range[0] && i <= range[1]) {
9                    continue label;
10                }
11            }
12
13            return false;
14        }
15
16        return true;
17    }
18}