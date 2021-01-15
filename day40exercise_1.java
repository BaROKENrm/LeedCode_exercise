package day40;
import java.util.Scanner;

//回文数是指数字从前往后读和从后往前读都相同的数字。
//
//        例如数字 12321 就是典型的回文数字。
//
//        现在给定你一个整数 B，请你判断 1∼300 之间的所有整数中，有哪些整数的平方转化为 B 进制后，其 B 进制表示是回文数字。
//
//        输入格式
//        一个整数 B。
//
//        输出格式
//        每行包含两个在 B 进制下表示的数字。
//
//        第一个表示满足平方值转化为 B 进制后是回文数字那个数，第二个数表示第一个数的平方。
//
//        所有满足条件的数字按从小到大顺序依次输出。
//
//        数据范围
//        2≤B≤20,
//        对于大于 9 的数字，用 A 表示 10，用 B 表示 11，以此类推。
public class day40exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        display(scan.nextInt());
    }

    public static void display(int n){
        int i = 1;
        for (i = 1; i <= 300; i++) {
            if(check(get(i * i,n))){
                System.out.println(i + " " + i * i);
            }
        }
    }
    public static String get(int num ,int n){
        StringBuilder sb = new StringBuilder();
        String code = "0123456789ABCDEFGHIJ";
        int mod = 0;
        while(num != 0){
            mod = num % n;
            num = num / n;
            sb = sb.append(mod);
        }
        return sb.toString();
    }
    public static boolean check(String s){
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}

