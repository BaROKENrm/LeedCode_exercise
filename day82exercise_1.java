package day82;

import java.util.ArrayList;
import java.util.List;
//54. 螺旋矩阵
public class day82exercise_1 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        if(n == 0){
            return list;
        }
        int m = matrix[0].length;
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int x = 0;
        int y = 0;
        int d = 0;
        boolean[][] flag = new boolean[n][m];
        for(int i = 0; i < n * m; i ++){
            list.add(matrix[x][y]);
            flag[x][y] = true;
            int a = x + dx[d];
            int b = y + dy[d];
            if(a < 0 || a >= n || b < 0 || b >= m || flag[a][b]){
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }
        return list;
    }
}
