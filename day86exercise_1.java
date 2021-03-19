package day86;

import java.util.Scanner;
//给定两个长度分别为 N 和 M 的字符串 A 和 B，求既是 A 的子序列又是 B 的子序列的字符串长度最长是多少。
//
//        输入格式
//        第一行包含两个整数 N 和 M。
//
//        第二行包含一个长度为 N 的字符串，表示字符串 A。
//
//        第三行包含一个长度为 M 的字符串，表示字符串 B。
//
//        字符串均由小写字母构成。
public class day86exercise_1 {
    static int N = 1010;
    static int[][] f = new int[N][N];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String str1 = scan.next();
        String str2 = scan.next();
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= m; j ++){
                f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]);
                if(str1.charAt(i - 1) == str2.charAt(j - 1)){
                    f[i][j] = Math.max(f[i][j],f[i - 1][j - 1] + 1);
                }
            }
        }
        System.out.println(f[n][m]);
    }
}
