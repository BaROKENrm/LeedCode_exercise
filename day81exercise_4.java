package day81;

import java.util.Scanner;
//完全背包一维
public class day81exercise_4 {
    static final int N = 1010;
    static int n ,m;
    static int[] v = new int[N];
    static int[] w = new int[N];
    static int[] f = new int[N];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        for(int i = 1; i <= n; i ++) {
            v[i] = scan.nextInt();
            w[i] = scan.nextInt();
        }

        for(int i = 1; i <= n; i ++){
            for(int j = v[i]; j <= m; j ++){
                    f[j] = Math.max(f[j],f[j - v[i]] + w[i]);
            }
        }
        System.out.println(f[m]);
    }
}
