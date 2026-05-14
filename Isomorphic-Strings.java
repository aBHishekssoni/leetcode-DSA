1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        if(s.length()!=t.length()) return false;
4    HashMap<Character,Character> hm = new HashMap<>();
5    for(int i=0;i<s.length();i++){
6        if(hm.containsKey(s.charAt(i))){
7            if(hm.get(s.charAt(i))!=t.charAt(i))
8             return false;
9        }
10        else if(hm.containsValue(t.charAt(i))){
11            // if(hm.get(s.charAt(i))!=t.charAt(i))
12             return false;
13        }else{
14            hm.put(s.charAt(i),t.charAt(i));
15        }
16    }
17    return true;
18    }
19}