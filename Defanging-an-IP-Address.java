1class Solution {
2    public String defangIPaddr(String address) {
3        // String s = "";
4        // for(int i=0;i<address.length();i++){
5        //    if(address.charAt(i) == '.'){
6        //         s+= "[.]";
7        //     }else s += address.charAt(i);
8        // }
9        // return s;
10        return address.replace(".","[.]");
11    }
12}