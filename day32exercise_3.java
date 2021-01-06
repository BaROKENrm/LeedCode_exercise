package day31;
//给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
public class day32exercise_3 {
    public int addDigits(int num) {
        while (num >= 10) {
            int next = 0;
            while (num != 0) {
                next = next + num % 10;
                num /= 10;
            }
            num = next;
        }
        return num;
    }
}
