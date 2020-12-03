package day06;

import java.util.Scanner;

//正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小
//        公倍数。
//        输入描述：
//        输入两个正整数A和B。
//        输出描述：
//        输出A和B的最小公倍数。
public class day06exercise_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        for (int i = Math.max(m,n); i <= m * n; i++){
            if(i % m == 0 && i % n == 0){
                System.out.println(i);
                return;
            }
        }
    }
}
