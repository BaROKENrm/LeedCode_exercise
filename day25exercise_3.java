package day25;
//编写一个程序判断给定的数是否为丑数。
//
//        丑数就是只包含质因数 2, 3, 5 的正整数。
public class day25exercise_3 {
    public static void main(String[] args) {
        System.out.println(isUgly(1));
    }
    public static boolean isUgly(int num) {
        while(num != 1){
            if(num % 2  == 0){
                num = num / 2;
                continue;
            }
            if(num % 3 == 0){
                num = num / 3;
                continue;
            }
            if(num % 5 == 0){
                num = num / 5;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
