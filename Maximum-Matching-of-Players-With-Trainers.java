1import java.util.*;
2
3class Solution {
4    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
5
6        Arrays.sort(players);
7        Arrays.sort(trainers);
8
9        int i = 0; // players
10        int j = 0; // trainers
11        int count = 0;
12
13        while(i < players.length && j < trainers.length){
14
15            if(players[i] <= trainers[j]) {
16                count++;   // match
17                i++;
18                j++;
19            } else {
20                j++;       // bigger trainer try karo
21            }
22        }
23
24        return count;
25    }
26}