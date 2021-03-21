package day88;

public class day88exercise_5 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int a = search(arr,8);
        System.out.println(a);
    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + right + 1>> 1;
            if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid;
            }
        }

        int ret = 0;
        while(left < nums.length && nums[left] == target){
            ret ++;
            left --;
        }
        return ret;
    }
}
