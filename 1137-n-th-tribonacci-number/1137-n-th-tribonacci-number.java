import java.util.Hashtable;
class Solution {
    Hashtable dp = new Hashtable();
    public int tribonacci(int n) {

        if (n == 0){
             return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        if(n>1){
             if(!dp.containsKey(n-1)){
                dp.put(n-1,tribonacci(n-1)) ;
            }
            if(!dp.containsKey(n-2)){
                dp.put(n-2,tribonacci(n-2)) ;
            }
            if(!dp.containsKey(n-3)){
                dp.put(n-3,tribonacci(n-3)) ;
            }
           return  (int )dp.get(n-1) + (int)dp.get(n-2)+(int)dp.get(n-3);
        }
        return n;
    }
}