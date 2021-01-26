package day48;

import java.util.HashSet;
import java.util.Set;
//剑指offer 03
public class day48exercise_3 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num:nums) {
            if(!set.contains(num)){
                set.add(num);
            }
            else{
                return num;
            }
        }
        return 0;
    }
}
