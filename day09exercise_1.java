package day09;

import java.util.Scanner;

//输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
//        输入描述：
//        输入为一行，n(1 ≤ n ≤ 1000)
//        输出描述：
//        输出一个整数,即题目所求
//        示例1:
//        输入
//        10
//        输出
//        2
public class day09exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = f(n);
        int count = 0;
        while(res > 10){
            if(res % 10 == 0){
                count++;
                res = res / 10;
            }
            else{
                System.out.println(count);
                return;
            }
        }
        System.out.println(count);
    }
    public static int f(int n){
        int i = 1;
        while(n > 0){
            i = i * n;
            n--;
        }
        return i;
    }
}
