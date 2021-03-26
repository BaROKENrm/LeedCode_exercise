package day94;

import java.util.Arrays;

//213. 打家劫舍 II
public class day94exercise_1 {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        if(len == 2){
            return Math.max(nums[0],nums[1]);
        }

        int[] arr1 = Arrays.copyOfRange(nums,0,len - 1);
        int[] arr2 = Arrays.copyOfRange(nums,1,len);
        return Math.max(fun(arr1),fun(arr2));
    }

    public int fun(int[] nums){
        int len = nums.length;
        int[] f = new int[len];
        f[0] = nums[0];
        f[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < len; i ++){
            f[i] = nums[i];
            f[i] = Math.max(f[i - 2] + nums[i],f[i - 1]);
        }
        return f[len - 1];
    }
}
