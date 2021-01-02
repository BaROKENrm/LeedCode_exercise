package day30sort;

import java.util.Arrays;

public class day30exercise_4SelectSort {
    public static void main(String[] args) {
        int[] arr = {9,18,27,16,35,14,21,23,1};
        for (int j = 0;j < arr.length - 1; j++) {
            int min = arr[j];
            int minIndex = j;
            for (int i = j + 1; i < arr.length; i++) {
                if(min > arr[i]){
                    min = arr[i];
                    minIndex = i;
                }
            }
            arr[minIndex] = arr[j];
            arr[j] = min;
        }
        System.out.println("从小到大排序--》" + Arrays.toString(arr));
        for (int j = 0;j < arr.length - 1; j++) {
            int max = arr[j];
            int maxIndex = j;
            for (int i = j + 1; i < arr.length; i++) {
                if(max < arr[i]){
                    max = arr[i];
                    maxIndex = i;
                }
            }
            arr[maxIndex] = arr[j];
            arr[j] = max;
        }
        System.out.println("从大到小排序--》" + Arrays.toString(arr));
    }
}
