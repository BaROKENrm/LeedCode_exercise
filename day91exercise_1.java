package day91;
//剑指 Offer 56 - I. 数组中数字出现的次数
public class day91exercise_1 {

    public int[] singleNumbers(int[] nums) {
        if(nums.length == 2){
            return nums;
        }
        int n = 0;
        int m = 1;
        int x = 0;
        int y = 0;
        for(int num : nums){
            n ^= num;
        }
        while((n & m) == 0){
            m = m << 1;
        }

        for(int num : nums){
            if((num & m) != 0){
                x ^= num;
            }
            else{
                y ^= num;
            }
        }
        return new int[]{x,y};
    }
}
