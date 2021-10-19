package Greedy.code122;

/**
 * 122. 买卖股票的最佳时机 II
 *
 * 给定一个数组 prices ，其中 prices[i] 是一支给定股票第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解题思路 : 贪心 由题可得我们要求的最大利润 就是求n个区间为（i,j]满足a[i]-a[j]最大的时候 i表示第i天买入 j表示第j天卖出
 * 等价于n个（i,i+1],(i+1,i+2]..(l-1,l]的和
 */

public class Java122 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i-1]){
                sum = prices[i] - prices[i-1];
            }
        }
        return sum;
    }
}
