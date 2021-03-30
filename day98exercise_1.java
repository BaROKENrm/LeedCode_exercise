package day98;
//剑指 Offer 14- I. 剪绳子
public class day98exercise_1 {
    public int cuttingRope(int n) {
        if(n <= 3){
            return 1 * (n - 1);
        }
        int res = 1;
        if(n % 3 == 1){
            res *= 4;
            n -= 4;
        }
        if(n % 3 == 2){
            res *= 2;
            n -= 2;
        }
        while(n != 0){
            res *= 3;
            n -= 3;
        }
        return res;
    }
}
