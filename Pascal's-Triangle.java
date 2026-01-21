1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> A = new ArrayList<>();
4        if(numRows==0) return A;
5        if(numRows==1) { A.add(Arrays.asList(1));
6        return A;
7        }
8        for(int i=1;i<=numRows;i++){
9            List<Integer> B = new ArrayList<>();
10            for(int j=0;j<i;j++){
11                B.add(1);
12            }
13            A.add(B);
14        }
15        for(int j=2;j<numRows;j++){
16        for(int i=1;i<A.get(j).size()-1;i++){
17         A.get(j).set(i,A.get(j-1).get(i)+A.get(j-1).get(i-1));
18        }
19        }
20        return A;
21    }
22}