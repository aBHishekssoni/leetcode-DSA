class Solution {
    public int arrayPairSum(int[] num) {
        Arrays.sort(num);
       int n = num.length;
        int sum =0;
        for(int i=0;i<n;i+=2){
   sum+=num[i];
        }
        return sum;
    }
}