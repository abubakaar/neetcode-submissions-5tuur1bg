class Solution {
    public int maxProfit(int[] prices) {

        int minValue = prices[0];
        int profit = 0;


        for ( int i = 1; i < prices.length; i++){

            if((prices[i] - minValue) > profit)
                profit = (prices[i] - minValue);
            
            if(minValue > prices[i])
                minValue = prices[i];
        }

        return profit;
        
    }
}
