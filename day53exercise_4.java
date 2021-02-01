package day53;

import java.util.Arrays;
import java.util.Comparator;

public class day53exercise_4 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int ret = 0;
        int r = Integer.MIN_VALUE;


        for (int[] num:pairs) {
            if(r == Integer.MIN_VALUE){
                r = num[1];
                ret++;
            }
            else{
                if(r < num[0]){
                    r = num[1];
                    ret++;
                }
                else{
                    continue;
                }
            }
        }
        return ret;
    }
}
