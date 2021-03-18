package day85;
//剑指 Offer 47. 礼物的最大价值
public class day85exercise_3 {
    public int maxValue(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] f = new int[row][col];
        f[0][0] = grid[0][0];

        for(int i = 1; i < col; i ++){
            f[0][i] = f[0][i - 1] + grid[0][i];
        }

        for(int i = 1; i < row; i ++){
            f[i][0] = f[i - 1][0] + grid[i][0];
        }

        for(int i = 1; i < row; i ++){
            for(int j = 1; j < col;j ++){
                f[i][j] = Math.max(f[i - 1][j],f[i][j - 1]) + grid[i][j];
            }
        }


        return f[row - 1][col - 1];
    }
}
