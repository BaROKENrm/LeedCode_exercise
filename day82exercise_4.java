package day82;
//剑指 Offer 39. 数组中出现次数超过一半的数字

public class day82exercise_4 {
    public int majorityElement(int[] nums) {
        int x = 0;
        int res = 0;
        for(int num : nums){
            if(res == 0){
                x = num;
            }
            res += (num == x) ? 1 : -1;
        }
        return x;
    }
}
