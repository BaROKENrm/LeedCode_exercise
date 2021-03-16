package day83;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class day83exercise_1 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,4,4,4,5,5,5,6};
        System.out.println(findtheNumber(arr, 3));
    }
    public static int findtheNumber (int[] arr, int k) {
        if(k > arr.length){
            return 0;
        }

        if(arr.length == 1){
            return arr[0];
        }
        // write code here
        Arrays.sort(arr);
        for(int i = 1; i < arr.length - 1; i ++){
            if(arr[i] != arr[i - 1] && arr[i + 1 ] != arr[i]){
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }
}
