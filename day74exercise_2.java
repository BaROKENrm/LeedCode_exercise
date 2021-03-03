package day74;
//leetcode 695. 岛屿的最大面积
public class day74exercise_2 {
    int col;
    int row;
    public int maxAreaOfIsland(int[][] grid) {
        col = grid.length;
        row = grid[0].length;
        int max = 0;
        for(int i = 0; i < col; i ++){
            for(int j = 0; j < row; j ++){
                max = Math.max(max,dfs(grid,i,j));
            }
        }
        return max;
    }

    public int dfs(int[][] grid,int n,int m){
        if(n < 0 || n >= col || m < 0 || m >= row || grid[n][m] == 0){
            return 0;
        }
        grid[n][m] = 0;
        int max = 1;
        max += dfs(grid,n + 1,m);
        max += dfs(grid,n - 1,m);
        max += dfs(grid,n,m + 1);
        max += dfs(grid,n,m - 1);
        return max;
    }
}
