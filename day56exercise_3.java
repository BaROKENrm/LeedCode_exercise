package day56;
//leetcode 643
public class day56exercise_3 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k;i++){
            sum += nums[i];
        }

        int max = sum;
        for(int i = k; i < nums.length; i++){
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max,sum);
        }
        return max / (k * 1.0);
    }
}
