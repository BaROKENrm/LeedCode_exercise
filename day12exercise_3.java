package day12;
//给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//        不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。


import java.util.HashSet;

public class day12exercise_3 {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                nums[count] = nums[i];
                count++;
            }
        }
        return set.size();
    }
}
