package day53;

import java.util.HashSet;
import java.util.Set;
//leetcode 888
public class day53exercise_3 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        for(int num:A){
            sumA += num;
        }
        for(int num:B){
            sumB += num;
        }

        int avg = ((sumA - sumB) / 2);

        Set<Integer> set = new HashSet<>();
        for (int num:A) {
            set.add(num);
        }

        for (int num:B) {
            int x = num + avg;
            if(set.contains(x)){
                return new int[]{x,num};
            }
        }
        return new int[]{};
    }
}
