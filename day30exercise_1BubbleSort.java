package day30sort;

import java.util.Arrays;

public class day30exercise_1BubbleSort {
    public static void main(String[] args) {
     int[] arr = {9,18,27,16,35,14,21,23,1};
        for (int j = 0;j < arr.length - 1;j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if(arr[i] > arr[i + 1]){
                    int  temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i +1] = temp;
                }
            }
        }
        System.out.println("从小到大排序--》" + Arrays.toString(arr));

        for (int j = 0;j < arr.length - 1;j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if(arr[i] < arr[i + 1]){
                    int  temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i +1] = temp;
                }
            }
        }
        System.out.println("从大到小排序--》" + Arrays.toString(arr));
    }
}
