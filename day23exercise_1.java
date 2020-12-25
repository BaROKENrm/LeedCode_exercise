package day23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
    //给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。

//若 nums[i]>0nums[i]>0：因为已经排序好，所以后面不可能有三个数加和等于 00，直接返回结果。
//        对于重复元素：跳过，避免出现重复解
//        令左指针 L=i+1L=i+1，右指针 R=n-1R=n−1，当 L<RL<R 时，执行循环：
//        当 nums[i]+nums[L]+nums[R]==0nums[i]+nums[L]+nums[R]==0，执行循环，判断左界和右界是否和下一位置重复，去除重复解。并同时将 L,RL,R 移到下一位置，寻找新的解
//        若和大于 00，说明 nums[R]nums[R] 太大，RR 左移
//        若和小于 00，说明 nums[L]nums[L] 太小，LL 右移

public class day23exercise_1 {
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        if(length < 3 || nums == null){
            return null;
        }
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList();
        for (int i = 0; i < length; i++) {

            if(nums[i] > 0){
                return ret;
            }
            //去重
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int left = i + 1;
            int right = length - 1;

            while (left < right) {
                //当等于0时存到list中
                if(nums[i] + nums[left] + nums[right] == 0){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ret.add(list);

                //去重
                while(left < right && nums[left + 1] == nums[left]){
                    left++;
                }

                while(left < right && nums[right] == nums[right - 1]){
                    right--;
                }

                left++;
                right--;

                }

                else if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }
                else{
                    right--;
                }
            }

        }
        return ret;
    }
}
