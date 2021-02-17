package day62;
//剑指 Offer 10- II. 青蛙跳台阶问题
public class day62exercise_2 {
    static int N = 1000000007;
    public int numWays(int n) {
        int a = 1;
        int b = 1;
        int sum = 0;
        for(int i = 0; i < n;i ++){
            sum = (a + b) % N;
            a = b;
            b = sum;
        }
        return a;
}
