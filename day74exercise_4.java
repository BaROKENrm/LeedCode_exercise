package day74;

import java.util.Arrays;

public class day74exercise_4 {
   // 剑指 Offer 29. 顺时针打印矩阵
    public static void main(String[] args) {
        day74exercise_4 day74exercise_4 = new day74exercise_4();
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[] ret = day74exercise_4.spiralOrder(arr);
        System.out.println(Arrays.toString(ret));
    }
    public int[] spiralOrder(int[][] matrix) {
        int n = matrix.length;
        if( n == 0){
            return new int[0];
        }
        int x = 0;
        int y = 0;
        int m = matrix[0].length;
        boolean[][] flag = new boolean[n][m];
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int d = 0;
        int[] ret = new int[n * m];
        for(int i = 0; i < n * m; i++){
            ret[i] = matrix[x][y];
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
        return ret;
    }
}
