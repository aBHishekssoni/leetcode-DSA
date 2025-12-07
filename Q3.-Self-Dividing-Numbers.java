1class Solution {
2    public List<Integer> selfDividingNumbers(int left, int right) {
3        ArrayList<Integer> arr = new ArrayList<>();
4        for(int i=left;i<=right;i++){
5            if(check(i))
6            arr.add(i);
7        }
8        return arr;
9    }
10        boolean check(int n){
11            int a =n;
12            while(a>0){
13              int digit = a % 10;
14            if (digit == 0) return false;    
15            if (n % digit != 0) return false;
16            a /= 10;
17            }
18            return true;
19        }
20}