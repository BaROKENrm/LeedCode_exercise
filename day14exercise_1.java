package day14;

//        给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//        你可以假设数组中无重复元素。
public class day14exercise_1 {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if(target > nums[n - 1]){
            return n;
        }
        if(target < nums[0]){
            return 0;
        }
        for (int i = 0; i < n; i++) {
            if(target == nums[i]){
                return i;
            }
            else if(target < nums[i]){
                return i;
            }
        }
        return -1;
    }
}
