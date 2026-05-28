1class Solution {
2    public String reverseVowels(String s) {
3        ArrayList<Character> arr = new ArrayList<>();
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
6                arr.add(s.charAt(i));
7            } 
8        }
9        String str = "";
10        int n = 0;
11         for(int i=0;i<s.length();i++){
12            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
13                str = str+ arr.get(arr.size() - 1 - n);
14                n++;
15            }else{
16                str = str+ s.charAt(i);
17            }
18        }
19        return str;
20    }
21}