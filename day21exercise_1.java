package day21;
//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//        如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
//        注意：你不能在买入股票前卖出股票。



public class day21exercise_1 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int n = prices.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                max = Math.max(prices[j] - prices[i],max);
            }
        }
        return max;
    }
}
