package day27;

import java.util.*;

//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。
public class day27exercise_1 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        for(int k: map.keySet()){
            if(map.get(k) == 1){
                return k;
            }
        }
        return -1;
    }
}

