package day06;


import java.util.Scanner;

//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
public class day06exercise_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(resever(x));
    }
    public static int resever(int x){
        long temp = 0;

        while(x != 0){
            int pop = x % 10;
            temp = temp * 10 + pop;

            if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
                return 0;
            }
            x /= 10;
        }
        return (int)temp;
    }
    }

