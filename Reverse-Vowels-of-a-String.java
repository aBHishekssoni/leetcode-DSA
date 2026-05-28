1class Solution {
2    public String reverseVowels(String s) {
3        //Meathod 2nd
4        int l=0,r=s.length()-1;
5         char[] ch = s.toCharArray(); 
6        boolean lt = false,rt = false;
7        while(l<r){
8            if (ch[l] != 'a' && ch[l] != 'e' && ch[l] != 'i' &&
9            ch[l] != 'o' && ch[l] != 'u' && ch[l] != 'A' &&
10            ch[l] != 'E' && ch[l] != 'I' && ch[l] != 'O' &&
11            ch[l] != 'U') {
12              l++;
13             lt = false;
14            }
15            else lt = true;
16            if (ch[r] != 'a' && ch[r] != 'e' && ch[r] != 'i' &&
17            ch[r] != 'o' && ch[r] != 'u' && ch[r] != 'A' &&
18            ch[r] != 'E' && ch[r] != 'I' && ch[r] != 'O' &&
19            ch[r] != 'U') {
20            r--;
21            rt = false;
22            }
23            else rt = true;
24            if(lt==true&&rt==true){
25                char temp = ch[l];
26                ch[l] = ch[r];
27                ch[r] = temp;
28                l++;
29                r--;
30                lt = false;
31                rt = false;
32            }
33        }
34        return new String(ch);
35
36
37
38
39
40
41
42
43            // Meathod 1st
44        // ArrayList<Character> arr = new ArrayList<>();
45        // for(int i=0;i<s.length();i++){
46        //     if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
47        //         arr.add(s.charAt(i));
48        //     } 
49        // }
50        // String str = "";
51        // int n = 0;
52        //  for(int i=0;i<s.length();i++){
53        //     if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
54        //         str = str+ arr.get(arr.size() - 1 - n);
55        //         n++;
56        //     }else{
57        //         str = str+ s.charAt(i);
58        //     }
59        // }
60        // return str;
61    }
62}