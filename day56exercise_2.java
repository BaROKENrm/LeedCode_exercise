package day56;

import java.util.Arrays;
import java.util.Scanner;
//筛选质数
public class day56exercise_2 {
    static int N = 100010;
    static int[] arr = new int[N];
    static int[] nums = new int[N];
    static boolean[] flag = new boolean[N];
    static int index = 0;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        get(n);
        System.out.println(index);
    }


    public static void get(int n){
        for(int i = 2;  i <= n;i++){
            if(!flag[i]){
                nums[index++] = i;
                for(int j = i + i; j <= n;j += i){
                    flag[j] = true;
                }
            }
        }
    }



}
