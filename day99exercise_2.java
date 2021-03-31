package day99;
//剑指 Offer 63. 股票的最大利润
public class day99exercise_2 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int min = prices[0];
        int res = 0;
        for(int i = 1; i < prices.length; i ++){
            res = Math.max(prices[i] - min,res);
            min = Math.min(min,prices[i]);
        }
        return res;
    }
}
