package day26;

public class day26exercise_3 {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int[] ret = {-1,-1};
        for (int i = 0; i < len; i++) {
            if(nums[i] == target){
                ret[0] = i;
                while(i + 1 < len && nums[i + 1] == nums[i]){
                    i++;
                }
                ret[1] = i;
                return ret ;
            }
        }
        return ret;
    }
}
