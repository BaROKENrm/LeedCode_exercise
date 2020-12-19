package day20;

import java.util.ArrayList;
import java.util.List;

//给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
public class day20exercise_1 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
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
        return ret.get(rowIndex - 1);
    }
}
