package day34;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

//现在需要在数轴上建立一家货仓，每天清晨，从货仓到每家商店都要运送一车商品。
//
//        为了提高效率，求把货仓建在何处，可以使得货仓到每家商店的距离之和最小。
//
//        输入格式
//        第一行输入整数N。
//
//        第二行N个整数 A1 ~ AN 。
//
//        输出格式
//        输出一个整数，表示距离之和的最小值。
//
//        数据范围
//        1≤N≤100000 ,
//        0≤Ai≤40000现在需要在数轴上建立一家货仓，每天清晨，从货仓到每家商店都要运送一车商品。
//
//        为了提高效率，求把货仓建在何处，可以使得货仓到每家商店的距离之和最小。
//
//        输入格式
//        第一行输入整数N。
//
//        第二行N个整数 A1 ~ AN 。
//
//        输出格式
//        输出一个整数，表示距离之和的最小值。
//
//        数据范围
//        1≤N≤100000 ,
//        0≤Ai≤40000
public class day34exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        System.out.println(minLen(n,nums));

    }
    public static int minLen(int n ,int[] nums){
        int index = n / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + Math.abs(index - nums[i]);
        }
        return sum;
    }
}
