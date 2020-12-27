package day25;
//给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
//
//        对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day25exercise_4 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> ret = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies < max){
                ret.add(false);
            }
            else{
                ret.add(true);
            }
        }
        return ret;
    }
}
