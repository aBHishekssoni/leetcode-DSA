1class Solution {
2    public int maxFreqSum(String s) {
3        int maxv=0,maxc=0;
4        HashMap<Character,Integer> hm = new HashMap<>();
5        for(char c: s.toCharArray())
6        hm.put(c,hm.getOrDefault(c,0)+1);
7        for(char c: s.toCharArray()){
8            if(c == 'a'||c == 'e'||c == 'i'|| c == 'o'|| c == 'u')
9            maxv  = Math.max(maxv,hm.get(c));
10            else
11            maxc  = Math.max(maxc,hm.get(c));
12        }
13        return maxc+maxv;
14    }
15}