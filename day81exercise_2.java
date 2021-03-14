package day81;

import java.util.Scanner;
//优化 01 背包
public class day81exercise_2 {
    static int N = 1010;
    static int n;
    static int w;
    static int[] vi = new int[N];
    static int[] wi = new int[N];
    static int[] f = new int[N];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        w = scan.nextInt();
        for(int i = 1; i <= n; i ++){
            vi[i] = scan.nextInt();
            wi[i] = scan.nextInt();
        }
        for(int i = 1; i <= n; i ++){
            for(int j = w; j >= vi[i]; j --){
                    f[j] = Math.max(f[j],f[j - vi[i]] + wi[i]);
            }
        }

        System.out.println(f[w]);
    }
}
