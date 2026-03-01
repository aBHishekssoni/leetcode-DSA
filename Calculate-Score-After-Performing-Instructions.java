1class Solution {
2    public long calculateScore(String[] instructions, int[] values) {
3        long score = 0;
4        int i = 0;
5        boolean[] visited = new boolean[values.length];
6
7        while(i >= 0 && i < values.length && !visited[i]) {
8            visited[i] = true;
9
10            if(instructions[i].equals("jump")) {
11                i += values[i];
12            } else {
13                score += values[i];
14                i++;
15            }
16        }
17
18        return score;
19    }
20}