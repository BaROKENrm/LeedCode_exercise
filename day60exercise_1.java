package day60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode 448
public class day60exercise_1 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        int len = nums.length;
        if(len < 1){
            return ret;
        }
        Arrays.sort(nums);
        int left = 0;
        for(int i = 1; i <= len; i++){
            if(nums[left] != i){
                ret.add(i);
            }
            while(nums[left] == i && left < len - 1){
                left ++;
            }

        }
        return ret;
    }
}
