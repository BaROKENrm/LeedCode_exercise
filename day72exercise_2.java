package day72;
//303. 区域和检索 - 数组不可变 
public class day72exercise_2 {
    int[] arr;
    public day72exercise_2(int[] nums) {
        int len = nums.length;
        arr = new int[len + 1];
        for(int i = 0; i < len; i++){
            arr[i + 1] = nums[i] + arr[i];
        }
    }

    public int sumRange(int i, int j) {
        return arr[j + 1] - arr[i];
    }
}
