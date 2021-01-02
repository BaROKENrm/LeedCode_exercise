package day30sort;

import java.util.Arrays;

public class day30exercise_2InsertSort {
    public static void main(String[] args) {
        int[] arr = {9,18,27,16,35,14,21,23,1};
        for (int i = 0; i < arr.length - 1; i++) {
            int value = arr[i + 1];
            int j = i;
            for (j = i; j >= 0 && arr[j] > value; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = value;
        }
        System.out.println("从小到大排序--》" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            int value = arr[i + 1];
            int j = i;
            for (j = i; j >= 0 && arr[j] < value; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = value;
        }
        System.out.println("从大到小排序--》" + Arrays.toString(arr));
    }
}
