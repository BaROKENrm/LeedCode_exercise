package day44;

import java.util.Arrays;

//  给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
//leetcode 628
public class day44exercise_1 {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[len - 1] * nums[len - 2] * nums[len - 3],nums[0] * nums[1] * nums[len - 1]);
    }
}
