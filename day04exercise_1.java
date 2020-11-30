package day04;

import java.util.Scanner;

//        小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
//        可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易
//        将不会购买。
public class day04exercise_1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println(count(n));
        }
    }
    public static int count(int n){
        if(n%2!=0||n==10||n<6){
            return -1;
        }
        if(n % 8 == 0){
            return n / 8;
        }
        return 1 + n / 8;
    }
    }