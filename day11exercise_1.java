package day11;

import java.util.Scanner;

//给定一个k位整数N = d k-1 *10 k-1 + ... + d 1 *10 1 + d 0 (0<=d i <=9, i=0,...,k-1, d k-1 >0)，请编写程序统计每种不同
//        的个位数字出现的次数。例如：给定N = 100311，则有2个0，3个1，和1个3。
//        输入描述：
//        每个输入包含1个测试用例，即一个不超过1000位的正整数N。
//        输出描述：
//        对N中每一种不同的个位数字，以D:M的格式在一行中输出该位数字D及其在N中出现的次数M。要求按D的
//        升序输出。
//        示例1:
//        输入
//        100311
//        输出
//        0:2
//        1:3
//        3:1
public class day11exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr =  {0,0,0,0,0,0,0,0,0};
        int tem = 0;
        while(n > 0){
            tem = n % 10;
            arr[tem]++;
            n = n / 10;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                continue;
            }
            System.out.println(i + ":" + arr[i]);
        }
    }
}
