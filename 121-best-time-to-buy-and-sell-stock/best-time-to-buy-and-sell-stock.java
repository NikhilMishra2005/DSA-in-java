class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        int max_profit = 0;
        int buy_prices = prices[0];

        for (int i = 1; i < n; i++) {
            if (prices[i] < buy_prices) {
                buy_prices = prices[i];
            } 
            else {
                int curr_profit = prices[i] - buy_prices;
                if (curr_profit > max_profit) {
                    max_profit = curr_profit;
                }
            }
        }
        return max_profit;
    }
}