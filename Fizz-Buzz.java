1class Solution {
2    public List<String> fizzBuzz(int n) {
3        List<String> str = new ArrayList<>();
4        for(int i=1;i<=n;i++){
5            if((i)%3==0&&(i)%5==0) str.add("FizzBuzz");
6            else if((i)%3==0) str.add("Fizz");
7            else if((i)%5==0) str.add("Buzz");
8            else str.add(i+"");
9        }
10        return str;
11    }
12}