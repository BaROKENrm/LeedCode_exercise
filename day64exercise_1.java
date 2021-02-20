package day64;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class day64exercise_1 {
    public int findShortestSubArray(int[] nums) {

        Map<Integer,int[]> map = new HashMap<>();
        int len = nums.length;
        for(int i = 0; i < len;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            }
            else{
                map.put(nums[i],new int[]{1,i,i});
            }
        }
        int maxNum = 0;
        int minLen = 0;
        for(Map.Entry<Integer,int[]> entry:map.entrySet()){
            int[] arr = entry.getValue();
            if (maxNum < arr[0]) {
                maxNum = arr[0];
                minLen = arr[2] - arr[1] + 1;
            } else if (maxNum == arr[0]) {
                if (minLen > arr[2] - arr[1] + 1) {
                    minLen = arr[2] - arr[1] + 1;
                }
            }
        }
        return minLen;
    }
}