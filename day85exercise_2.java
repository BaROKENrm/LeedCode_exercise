package day85;
//剑指 Offer 42. 连续子数组的最大和
public class day85exercise_2 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        int[] f = new int[len];
        f[0] = nums[0];
        for(int i = 1; i < len; i ++){
            f[i] = Math.max(f[i - 1] + nums[i] , nums[i]);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i ++){
            max = Math.max(max,f[i]);
        }
        return max;
    }
}
