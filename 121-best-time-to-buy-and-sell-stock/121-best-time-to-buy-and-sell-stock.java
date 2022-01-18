class Solution {
    public int maxProfit(int[] prices) {
        int nextMax=prices[prices.length-1];
        int profit=0;
        for(int i=prices.length-2;i>=0;i--)
        {
            if(prices[i]>nextMax)
            {
                nextMax=prices[i];
            }
            else
            {
                profit = profit < nextMax-prices[i] ? nextMax-prices[i]: profit;
            }
        }
        return profit;
    }
}