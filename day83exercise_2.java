package day83;
//59. 螺旋矩阵 II
public class day83exercise_2 {
    public int[][] generateMatrix(int n) {
        int[][] ret = new int[n][n];
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        boolean[][] flag = new boolean[n][n];
        int x = 0;
        int y = 0;
        int d = 0;
        for(int i = 1; i <= n * n; i ++){
            ret[x][y] = i;
            flag[x][y] = true;
            int a = x + dx[d];
            int b = y + dy[d];
            if(a >= n || a < 0 || b >= n || b < 0 || flag[a][b]){
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }
        return ret;
    }
}
