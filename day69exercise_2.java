package day69;
//剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
public class day69exercise_2 {
    public int[] exchange(int[] nums) {
        int left = 0;
        if(nums.length == 0) return nums;
        int right = nums.length - 1;
        while(left < right){
            if(nums[left] % 2 == 1){
                left++;
                continue;
            }
            if(nums[right] % 2 == 0){
                right--;
                continue;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

        }
        return nums;
    }
}
