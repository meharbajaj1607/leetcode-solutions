class Solution {
    public int maxProfit(int[] prices) {
        //int max = 0;
        // for(int i=prices.length-1;i>=0;i--){
        //     for(int j=i-1;j>=0;j--){
        //         int diff = prices[i]-prices[j];
        //         max = Math.max(max,diff);
        //     }
        // }
        //return max;
        
        int profit=0;
        int min = prices[0];
        for(int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            profit = Math.max(profit,prices[i]-min);
        }
        return profit;
    }
}