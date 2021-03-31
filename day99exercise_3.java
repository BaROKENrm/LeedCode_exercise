package day99;
//剑指 Offer 14- II. 剪绳子 II
public class day99exercise_3 {
    static int N = 1000000007;
    public int cuttingRope(int n) {

        if(n <= 3){
            return n - 1;
        }
        long res = 1;
        if(n % 3 == 1){
            res *= 4;
            n -= 4;
        }
        if(n % 3 == 2){
            res *= 2;
            n -= 2;
        }
        while(n != 0){
            res = (res * 3) % N;
            n -= 3;
        }
        return (int)res;
    }
}
