package day37;

import java.util.Scanner;

//蛇形矩阵
public class day37exercise_1 {
    public static void main(String[] args) {
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        int d = 1;
        int x = 0;
        int y = 0;
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();//行
        int n = scan.nextInt();//列
        int[][] nums = new int[m][n];
        boolean[][] flag = new boolean[m][n];
        for (int i = 1; i <= m * n; i++) {
            nums[x][y] = i;
            flag[x][y] = true;
            int a = x + dx[d];
            int b = y + dy[d];
            if(a < 0 || a >= m || b < 0 || b >= n || flag[a][b] == true){
                    d = (d + 1) % 4;
                    a = x + dx[d];
                    b = y + dy[d];
            }
            x = a;
            y = b;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf( "%7d",nums[i][j] );
            }
            System.out.println();
        }
    }
}
