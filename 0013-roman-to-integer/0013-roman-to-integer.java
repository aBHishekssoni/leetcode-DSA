// class Solution {
//     public int romanToInt(String s) {
//         int sum=0;
//         int I=1,X=10,C=100,V=5,L=50,D=500,M=1000;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='I'&&(s.charAt(i+1)=='V'||s.charAt(i+1)=='X'))
//            sum-=1;
//                 sum+=s.charAt(i);
            
//         }
//         return sum;
//     }
// }




class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
        }
        
        return ans;
    }
}