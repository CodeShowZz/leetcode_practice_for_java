## 题目信息
给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。

在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。

返回 你能获得的 最大 利润 。

 

示例 1：

输入：prices = [7,1,5,3,6,4]
输出：7
解释：在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5 - 1 = 4 。
     随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6 - 3 = 3 。
     总利润为 4 + 3 = 7 。
示例 2：

输入：prices = [1,2,3,4,5]
输出：4
解释：在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5 - 1 = 4 。
     总利润为 4 。
示例 3：

输入：prices = [7,6,4,3,1]
输出：0
解释：在这种情况下, 交易无法获得正利润，所以不参与交易可以获得最大利润，最大利润为 0 

## 解题思路
1. 因为股票买卖设计买出卖入,你可以选择某天进行买入,或在某天进行卖出,但是你不可以在持有的情况下再持有一次,不持有的情况下进行卖出.因此对于某一天来说,你要么持有一支股票,要么不持有一支股票.
2.我们可以根据当天股票价格,来得出当天继续持有或者不持有股票时拥有的最大利润.如果当天要继续持有股票,那么有两种情况,一是前一天的股票处于持有状态,现在继续持有.二是前一天不持有股票,今天进行卖出,假设前一天持有时的最大利润为A,那么继续持有的最大利润还为A.如果前一天不持有的最大利润为B,那么持有之后的最大利润为B-股票当日价格.那么继续持有的最大利润就等于max(A,B-当日股票价格).
3.对于当天不持有股票的情况是类似的,要么前一天不持有股票,要么前一天持有股票然后今日卖出.如果前一天不持有的最大利润为C,只有的最大利润为D,那么继续持有的最大利润就等于max(C,D+当日股票价格)
4.根据这个过程,可以使用动态规划来做,具体方式是建立一个N*2的二维数组,其中列表示持有和不持有两种情况.行代表具体的天数
5.很明显,最终股票不持有时利润肯定比持有的时候来的大,那么最后一天未持有的最大值就是最终的答案

## 具体代码
