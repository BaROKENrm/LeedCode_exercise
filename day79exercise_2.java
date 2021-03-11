package day79;

import java.util.Scanner;
//有 N 件物品和一个容量是 V 的背包。每件物品只能使用一次。
//
//第 i 件物品的体积是 vi，价值是 wi。
//
//求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。
//输出最大价值。
public class day79exercise_2 {
    static int N = 1010;
    static int v;
    static int w;
    static int[] vi = new int[N];
    static int[] wi = new int[N];
    static int[][] f = new int[N][N];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        v = scan.nextInt();
        w = scan.nextInt();
        for(int i = 1; i <= v; i ++){
            vi[i] = scan.nextInt();
            wi[i] = scan.nextInt();
        }
        for(int i = 1; i <= v; i ++){
            for(int j = 1; j <= w; j ++){
                f[i][j] = f[i - 1][j];
                if(j >= vi[i]){
                    f[i][j] = Math.max(f[i][j],f[i - 1][j - vi[i]] + wi[i]);
                }
            }
        }
        System.out.println(f[v][w]);
    }
}
