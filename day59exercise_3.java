package day59;
//剑指 Offer 10- I. 斐波那契数列
public class day59exercise_3 {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 0; i < n; i++){
            c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return a;
    }

}
