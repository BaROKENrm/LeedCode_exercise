package day19;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
public class day19exercise_4 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    list.add(1);
            }
                else{
                   list.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
        }
            ret.add(list);
        }
        return ret;
    }
}
