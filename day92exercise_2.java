package day91;
//329. 矩阵中的最长递增路径
public class day92exercise_2 {
    boolean[][] flag;
    int row;
    int col;
    int max = Integer.MIN_VALUE;
    int[][] f;
    public int longestIncreasingPath(int[][] matrix) {
        row = matrix.length;
        col = matrix[0].length;
        f = new int[row][col];
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                max = Math.max(max,dfs(matrix,i,j));
            }
        }
        return max;
    }

    public int dfs(int[][] matrix,int i, int j){
        if(f[i][j] != 0){
            return f[i][j];
        }
        int up = 0;
        int down = 0;
        int right = 0;
        int left = 0;
        if(i + 1 < row && matrix[i][j] < matrix[i + 1][j]){
            up = dfs(matrix, i + 1,j);
        }
        if(i - 1 >= 0 && matrix[i][j] < matrix[i - 1][j]){
            down = dfs(matrix,i - 1, j);
        }
        if(j + 1 < col && matrix[i][j] < matrix[i][j + 1]){
            right = dfs(matrix,i,j + 1);
        }
        if(j - 1 >= 0 && matrix[i][j] < matrix[i][j - 1]){
            left = dfs(matrix,i,j - 1);
        }
        int res = Math.max(Math.max(up,down),Math.max(left,right)) + 1;
        f[i][j] = res;
        return f[i][j];
    }
}
