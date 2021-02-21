package day65;
//剑指 Offer 15. 二进制中1的个数
public class day65exercise_2 {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            if((n & 1 )== 1){
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }
}
