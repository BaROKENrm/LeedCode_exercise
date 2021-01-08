package day33;
//一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
//
//        机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
//
//        现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？

public class day33exercise_2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;//行数
        int n = obstacleGrid[0].length;//列数
        int[][] dp = new int[m][n];
        for (int i = 0; i < n && obstacleGrid[0][i] == 0; i++) {//第一行没有障碍物全部是1
            dp[0][i] = 1;
        }
        for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {//第一列没有障碍物全部是1
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] == 0){
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
