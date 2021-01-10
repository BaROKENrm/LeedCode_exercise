package day35;

public class day35exercise_3 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            dp[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                if(nums[i] > nums[j]){
                    dp[i] = dp[i] + 1;
                }
            }
        }
        int max= 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
