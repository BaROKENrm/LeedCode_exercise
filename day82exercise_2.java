package day82;

import javax.swing.*;
import java.util.Scanner;

//    有 N 种物品和一个容量是 V 的背包。
//
//    第 i 种物品最多有 si 件，每件体积是 vi，价值是 wi。
//
//    求解将哪些物品装入背包，可使物品体积总和不超过背包容量，且价值总和最大。
//    输出最大价值。
public class day82exercise_2 {
    static int N = 110;
    static int[] vi = new int[N];
    static int[] wi = new int[N];
    static int[] si = new int[N];
    static int[][] f = new int[N][N];
    static int n,m;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        for(int i = 1; i <= n; i ++){
            vi[i] = scan.nextInt();
            wi[i] = scan.nextInt();
            si[i] = scan.nextInt();
        }

        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= m; j ++){
                for(int k = 0; k * vi[i] <= j && k <= si[i]; k ++){
                    f[i][j] = Math.max(f[i][j],f[i - 1][j - vi[i] * k] + wi[i] * k);
                }
            }
        }
        System.out.println(f[n][m]);
    }
}
