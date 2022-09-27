class Solution {
    public int maxProfit(int[] prices) {
        int minEle = prices[0];
        int maxProfit = 0;
        for(int price: prices){
            minEle = Math.min(minEle, price);
            maxProfit = Math.max(maxProfit, price - minEle);
        }
        return maxProfit;
    }
}