package day33;
//给定一个三角形 triangle ，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
//        相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
//        也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。

import java.util.List;
//从左边下来 dp[i - 1][j - 1] + triangle[i][j]
//从右边下来 dp[i - 1][j] + triangle[i][j]
public class day33exercise_1 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int dp[][] = new int[len][len];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < len; i++) {
            dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
            }
            dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);
        }
        int min = dp[len - 1][0];
        for (int i = 1; i < len; i++) {
            min = Math.min(min , dp[len - 1][i]);
        }
        return min;
    }
}
