package day41;

import java.util.Scanner;

//有 N 件物品和一个容量是 V 的背包。每件物品只能使用一次。
//
//        第 i 件物品的体积是 vi，价值是 wi。
//
//        求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。
//        输出最大价值。
//
//        输入格式
//        第一行两个整数，N，V，用空格隔开，分别表示物品数量和背包容积。
//
//        接下来有 N 行，每行两个整数 vi,wi，用空格隔开，分别表示第 i 件物品的体积和价值。
//
//        输出格式
//        输出一个整数，表示最大价值。
//
//        数据范围
//        0<N,V≤1000
//        0<vi,wi≤1000
public class day41exercise_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//物品数量
        int v = scan.nextInt();//背包容量
        int[] vi = new int[n + 1];//物品体积
        int[] wi = new int[n + 1];//物品价值
        int[][] dp = new int[n + 1][v + 1];
        for (int i = 1; i <= n; i++) {
            vi[i] = scan.nextInt();
            wi[i] = scan.nextInt();
        }
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j <= v; j++) {
                dp[i][j] = dp[i - 1][j];
                if(j >= vi[i]){
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - vi[i]] + wi[i]);
                }
                else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][v]);

    }
}
