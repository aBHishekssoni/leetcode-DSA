class Solution {
    public int maxProfit(int[] prices) {
        // int p = 0,a=0,m=Integer.MAX_VALUE,i=0;
        // for(i=0;i<prices.length;i++){
        //     if(m>=prices[i]){
        //         m = prices[i];
        //         a=i;
        //     }
        // }
        // if(a==prices.length-1) return 0;
        // for(int j=a+1;j<prices.length;j++){
        //     if(m<prices[j]&&p<prices[j])
        //     p= prices[j];
        //     if(p>m&&j==prices.length-1)
        //     return (p-m);
        // }
        // return 0;

    
        int n = prices.length;
        int min = prices[0];
        int profit = 0;
        for(int i=1;i<n;i++) {
            int temp = prices[i] - min;
            min = Math.min(prices[i],min);
            if(profit < temp)  profit = temp;           
        }
        return profit;
	
    }
}