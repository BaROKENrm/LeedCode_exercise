package day66;
//剑指 Offer 17. 打印从1到最大的n位数
public class day66exercise_1 {
    public int[] printNumbers(int n) {
        int len = 1;
        while(n-- > 0){
            len = len * 10;
        }
        int[] ret = new int[len - 1];
        for(int i = 1; i < len;i++){
            ret[i - 1] = i;
        }
        return ret;
    }
}
