package day23;
//给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

import java.util.Arrays;

public class day23exercise_2 {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        int ret = 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len - 1; i++) {
            int left = i + 1;
            int right = len - 1;
            while(left < right){
                int value = nums[i] + nums[left] + nums[right];
                if(value == target){
                    return value;
                }
                if(Math.abs(value - target) < min){
                    min = Math.abs(value - target);
                    ret = value;
                }
                if(value > target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return ret;
    }
}
