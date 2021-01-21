package day45;

import java.util.Arrays;
import java.util.Scanner;

//十三号星期五真的很不常见吗？
//
//        每个月的十三号是星期五的频率是否比一周中的其他几天低？
//
//        请编写一个程序，计算 N 年内每个月的 13 号是星期日，星期一，星期二，星期三，星期四，星期五和星期六的频率。
//
//        测试的时间段将会开始于 1900 年 1 月 1 日，结束于 1900+N−1 年 12 月 31日。
//
//        一些有助于你解题的额外信息：
//
//        1900 年 1 月 1 日是星期一。
//        在一年中，4 月、6 月、9 月、11 月每个月 30 天，2 月平年 28 天，闰年 29 天，其他月份每个月31天。
//        公历年份是 4 的倍数且不是 100 的倍数的年份为闰年，例如 1992 年是闰年，1990 年不是闰年。
//        公历年份是整百数并且是 400 的倍数的也是闰年，例如1700年，1800年，1900年，2100年不是闰年，2000年是闰年。
//        输入格式
//        共一行，包含一个整数 N。
//
//        输出格式
//        共一行，包含七个整数，整数之间用一个空格隔开，依次表示星期六，星期日，星期一，星期二，星期三，星期四，星期五在十三号出现的次数。
//
//        数据范围
//        1≤N≤400
public class day45exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int[] weekday = {0,0,0,0,0,0,0};
        int days = 0;//这个月距离1900 1 1 过了多少天
        for (int year = 1900; year < 1900 + n; year++) {//年
            if((year % 4 == 0 && year % 100 != 0) || year % 100 == 0 && year % 400 == 0){
                month[2] += 1;
            }
            for (int j = 1; j <= 12; j++) {//月
                weekday[(days + 12) % 7]++;
                days= days + month[j];
            }
            month[2] = 28;
        }
        System.out.println(Arrays.toString(weekday));
    }
}
