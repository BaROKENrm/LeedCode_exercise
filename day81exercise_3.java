package day81;

import java.util.Scanner;
//完全背包二维 和 二维优化
public class day81exercise_3 {
    static final int N = 1010;
    static int n ,m;
    static int[] v = new int[N];
    static int[] w = new int[N];
    static int[][] f = new int[N][N];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        for(int i = 1; i <= n; i ++) {
            v[i] = scan.nextInt();
            w[i] = scan.nextInt();
        }

//        for(int i = 1; i <= n; i ++){
//            for(int j = 0; j <= m; j ++){
//                for(int k = 0; k * v[i] <= j; k ++){
//                    f[i][j] = Math.max(f[i][j],f[i - 1][j - k * v[i]] + k * w[i]);
//                }
//            }
//        }
        //优化：
        for(int i = 1; i <= n; i ++){
            for(int j = 0; j <= m; j ++){
                f[i][j] = f[i - 1][j];
                if(j >= v[i]){
                    f[i][j] = Math.max(f[i][j],f[i][j - v[i]] + w[i]);
                }
            }
        }
        System.out.println(f[n][m]);
    }
}
