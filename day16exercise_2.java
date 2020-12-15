package day16;
//实现 int sqrt(int x) 函数。
//        计算并返回 x 的平方根，其中 x 是非负整数。
//        由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。

public class day16exercise_2 {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
    public static int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        long a = 0;
        long b = 0;
        long i = 0;
        for (i = 0; i < x; i++) {
            a = i * i;
            b = (i + 1) * (i + 1);
            if((x > a && x < b) || x == a){
                return (int)i;
            }
            if(x == b){
                return (int)(i + 1);
            }

        }
        return -1;
    }
}

