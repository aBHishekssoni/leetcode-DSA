class Solution {
    public String reverseVowels(String s) {
        //Meathod 2nd
        int l=0,r=s.length()-1;
         char[] ch = s.toCharArray(); 
        boolean lt = false,rt = false;
        while(l<r){
            if (ch[l] != 'a' && ch[l] != 'e' && ch[l] != 'i' &&
            ch[l] != 'o' && ch[l] != 'u' && ch[l] != 'A' &&
            ch[l] != 'E' && ch[l] != 'I' && ch[l] != 'O' &&
            ch[l] != 'U') {
              l++;
             lt = false;
            }
            else lt = true;
            if (ch[r] != 'a' && ch[r] != 'e' && ch[r] != 'i' &&
            ch[r] != 'o' && ch[r] != 'u' && ch[r] != 'A' &&
            ch[r] != 'E' && ch[r] != 'I' && ch[r] != 'O' &&
            ch[r] != 'U') {
            r--;
            rt = false;
            }
            else rt = true;
            if(lt==true&&rt==true){
                char temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
                lt = false;
                rt = false;
            }
        }
        return new String(ch);








            // Meathod 1st
        // ArrayList<Character> arr = new ArrayList<>();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
        //         arr.add(s.charAt(i));
        //     } 
        // }
        // String str = "";
        // int n = 0;
        //  for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
        //         str = str+ arr.get(arr.size() - 1 - n);
        //         n++;
        //     }else{
        //         str = str+ s.charAt(i);
        //     }
        // }
        // return str;
    }
}