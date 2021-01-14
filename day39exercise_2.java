package day39;

import java.util.ArrayList;
import java.util.List;
//给定由若干 0 和 1 组成的数组 A。我们定义 N_i：从 A[0] 到 A[i] 的第 i 个子数组被解释为一个二进制数（从最高有效位到最低有效位）。
//
//        返回布尔值列表 answer，只有当 N_i 可以被 5 整除时，答案 answer[i] 为 true，否则为 false。
//leetcode 1018
public class day39exercise_2 {
    public static void main(String[] args) {
        System.out.println(0<<1);
        int[] A = {0,1,1,1,1,1};
        prefixesDivBy5(A);
    }
    public static List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = ((sum << 1) + A[i]) ;
            list.add(sum % 5 == 0);
        }
        return list;
    }
}
