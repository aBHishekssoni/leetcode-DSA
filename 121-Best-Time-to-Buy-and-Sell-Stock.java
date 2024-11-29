class Solution {
    public int maxProfit(int[] prices) {
        // int n = prices.length;
        // int min = prices[0];
        // int profit = 0;
        // for(int i=1;i<n;i++) {
        //     int temp = prices[i] - min;
        //     min = Math.min(prices[i],min);
        //     if(profit < temp)  profit = temp;           
        // }
        // return profit;


         int maxProf = 0;
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int currPrice = prices[i];
            if(currPrice > buyPrice){
                maxProf = Math.max(maxProf, currPrice - buyPrice);
            }else{
                buyPrice = currPrice;
            }
        }
        return maxProf;
\t
    }
}