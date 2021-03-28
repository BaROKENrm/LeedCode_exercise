package day96;
//给定一个长度为 N 的整数数列，输出每个数左边第一个比它小的数，如果不存在则输出 −1。

import java.util.Scanner;

public class day96exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        int[] stack = new int[N];
        int index = 0;
        for(int i = 0; i < N; i ++){
            int x = scan.nextInt();
            while(index != 0 && stack[index] >= x){
                index --;
            }
            if(index == 0){
                System.out.println(-1);
            }
            else{
                System.out.println(stack[index]);
            }
            stack[++ index] = x;
        }
    }
}
