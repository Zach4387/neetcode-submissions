class Solution {
    public int maxProfit(int[] prices) {
        
        int minBuy = prices[0];
        int[] profits = new int[prices.length];
        int maxProfit =0;


        //go through each prices
        //keep track of min buy prices to left of current index
        // calculate profit using current price - minBuyPriceToLeft, save in profits[];
        //return max profit;
        
        for(int i =0; i < prices.length; i++) {
            if(prices[i] < minBuy){
                minBuy = prices[i];
            }

            int profit = prices[i] - minBuy;
            profits[i] = profit;
            if(profit> maxProfit){
                maxProfit = profit;
            }

        }   

        return maxProfit;
    }
}
