class Solution {
    public boolean isValid(String A) {
              if(A.length()%2!=0) return false;
         Stack<Character> s = new Stack<>();
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='('||A.charAt(i)=='{'||A.charAt(i)=='[')
            s.push(A.charAt(i));
            else if(!s.isEmpty()&&((A.charAt(i)==')'&&s.peek()=='(')||(A.charAt(i)=='}'&&s.peek()=='{')||(A.charAt(i)==']'&&s.peek()=='[')))
             s.pop();
             else return false;
        }
        if(s.isEmpty()) return true;
        return false;

    }
}

  

