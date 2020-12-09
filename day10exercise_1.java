package day10;
import java.util.*;

//        给一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少
//        需要多少步可以变为Fibonacci数。
//        输入描述：
//        输入为一个正整数N(1 ≤ N ≤ 1,000,000)
//        输出描述：
//        输出一个最小的步数变为Fibonacci数"
//        示例1:
//        输入
//        15
//        输出
//        2
public class day10exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        while(n > c){
            a = b;
            b = c;
            c = a + b;
        }
        int f1 = n - b;
        int f2 = c - n;
        System.out.println(f1 > f2 ? f2 : f1);
    }
}
