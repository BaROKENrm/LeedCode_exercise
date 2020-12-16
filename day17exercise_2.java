package day17;
//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
public class day17exercise_2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1;
        int q = m - 1;
        int j = m + n - 1;
        while((p >= 0) && (q >= 0)){
            nums1[j--] = nums1[p] > nums2[q] ? nums1[p--] : nums2[q--];

        }
        System.arraycopy(nums2, 0, nums1, 0, q + 1);
    }
}
