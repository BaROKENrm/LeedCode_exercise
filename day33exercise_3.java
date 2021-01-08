package day33;

import java.util.Arrays;

//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
public class day33exercise_3 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] newNums = new int[len];
        for (int i = 0; i < len; i++) {
            newNums[(i + k) % len] = nums[i];
        }
        System.arraycopy(newNums, 0, nums, 0, len);
    }
}
