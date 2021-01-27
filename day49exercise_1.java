package day49;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//给定 n 个区间 [li,ri]，要求合并所有有交集的区间。
//
//        注意如果在端点处相交，也算有交集。
//
//        输出合并完成后的区间个数。
//
//        例如：[1,3]和[2,6]可以合并为一个区间[1,6]。
//
//        输入格式
//        第一行包含整数n。
//
//        接下来n行，每行包含两个整数 l 和 r。
//
//        输出格式
//        共一行，包含一个整数，表示合并区间完成后的区间个数。
//
//        数据范围
//        1≤n≤100000,
//        −109≤li≤ri≤109
public class day49exercise_1 {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> ret = new ArrayList<>();
        int l = Integer.MIN_VALUE;
        int r = Integer.MIN_VALUE;
        for (int[] a :intervals) {
            if(a[0] > r){
                if(r != Integer.MIN_VALUE){
                    ret.add(new int[]{l,r});
                }
                l = a[0];
                r = a[1];
            }
            else{
                r = Math.max(r,a[1]);
            }
        }
        ret.add(new int[]{l,r});
        return ret.toArray(new int[ret.size()][]);
    }
}

