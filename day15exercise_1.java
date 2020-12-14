package day15;
//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
public class day15exercise_1 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];

        for (int j = 0; j < nums.length; j++) {
            for (int i = j; i < nums.length; i++) {
                sum = sum + nums[i];
                max = Math.max(max,sum);
            }
            sum = 0;
        }
        return max;
    }
}
