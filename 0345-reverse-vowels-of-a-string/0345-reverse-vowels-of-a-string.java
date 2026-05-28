class Solution {
    public String reverseVowels(String s) {
        // HashMap<Character,Character> hm = new HashMap<>();
        ArrayList<Character> arr = new ArrayList<>();
        // HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                arr.add(s.charAt(i));
            } 
        }
        String str = "";
        int n = 0;
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                str = str+ arr.get(arr.size() - 1 - n);
                n++;
            }else{
                str = str+ s.charAt(i);
            }
        }
        return str;
    }
}