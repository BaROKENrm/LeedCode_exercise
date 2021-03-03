package day74;
//leetcode 338比特位计数
public class day74exercise_1 {
    public int[] countBits(int num) {
        int[] ret = new int[num + 1];
        for(int i = 0; i <= num; i++){
            ret[i] = get(i);
        }
        return ret;
    }

    public int get(int num){
        int count = 0;
        while(num != 0){
            if((num & 1 )== 1){
                count++;
            }
            num = num >>> 1;
        }
        return count;
    }
}
