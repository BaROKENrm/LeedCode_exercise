package day54;

import java.util.Arrays;

//leetcode 31
public class day54exercise_3 {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        for(int i = len - 1; i > 0; i--){
            if(nums[i] > nums[i - 1]){
                Arrays.sort(nums,i,len);
                for(int j = i; j < len;j++){
                    if(nums[j] > nums[i - 1]){
                        int temp = nums[i -1];
                        nums[i - 1] = nums[j];
                        nums[j] = temp;
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);
        return;
    }
}
