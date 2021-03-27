package day95;

import java.util.ArrayList;
import java.util.List;
//剑指 Offer 57 - II. 和为s的连续正数序列
public class day95exercise_1 {
    public int[][] findContinuousSequence(int target) {
        int i = 1;
        int j = 1;
        int sum = 0;
        List<int[]> list = new ArrayList<>();
        while(i <= target / 2){
            if(sum < target){
                sum += j;
                j ++;
            }
            else if(sum > target){
                sum -= i;
                i ++;
            }
            else{
                int count = 0;
                int[] arr = new int[j - i];
                for(int k = i; k < j; k ++){
                    arr[count ++] = k;
                }
                list.add(arr);
                sum -= i;
                i ++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }

}
