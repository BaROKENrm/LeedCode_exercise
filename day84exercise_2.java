package day84;

import java.util.Scanner;

/*
给定一个长度为N的数列，求数值严格单调递增的子序列的长度最长是多少。

输入格式
第一行包含整数N。

第二行包含N个整数，表示完整序列。
 */
public class day84exercise_2 {
    static int N = 1010;
    static int[] arr = new int[N];
    static int[] f = new int[N];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i <= n; i ++){
            arr[i] = scan.nextInt();
        }
        for(int i = 1; i <= n;i ++){
            f[i] = 1;
            for(int j = 1; j < i; j ++){
                if(arr[i] > arr[j]){
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
        }
        int max = -1;
        for(int i = 1; i <= n; i ++){
            max = Math.max(max,f[i]);
        }
        System.out.println(max);
    }
}
