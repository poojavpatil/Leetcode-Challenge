/* Say you have an array prices for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times). */

class Solution {
    public int maxProfit(int[] prices) 
    {
        int diff = 0;
        for(int i = 1; i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                diff = diff + prices[i] - prices[i-1];
            }
        }
        return diff;
    }
}
