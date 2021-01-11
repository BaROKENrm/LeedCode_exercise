package day36;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
//        说明：
//        所有数字都是正整数。
//        解集不能包含重复的组合。 

public class day36exercise_2 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        if (k > 9 || n < 1 || n >= k * 9) return ans;

        dfs(1, k, n, new LinkedList<>(), ans);

        return ans;
    }

    // start：当前可以选择的数字范围为 [start ... 9]
    // k：在[start ... 9]范围上，还剩k个数要选择
    // rest：在[start ... 9]范围上，剩余要搞定的和
    // path：之前的尝试路径已经加到path中，你不需要操心了，你只需要在[start ... 9]范围上给我搞定rest
    // ans：如果找到一条可行方案，给我加到ans中
    private static void dfs(int start, int k, int rest,
                            LinkedList<Integer> path,
                            List<List<Integer>> ans) {
        if (start > 10 - k) return; // [start ... 9]范围上，选不够k个数了，当前尝试方案无效

        if (rest < 0) return; // 只要发现rest < 0，表示当前尝试方案无效

        if (rest == 0) {
            if (k > 0) return; // rest == 0，却还有数没选够，说明当前尝试方案无效
            else { // 当前尝试方案有效，找到了一条路径，加入答案
                ans.add(new ArrayList<>(path));
                return;
            }
        }
        if (k == 0) return; // rest > 0，却没有数可选了，说明当前尝试方案无效

        // rest > 0 && k > 0，在[start ... 9]范围上，依次尝试每一个数
        for (int cur = start; cur < 10; cur++) {
            path.add(cur);
            dfs(cur+1, k-1, rest - cur, path, ans);
            path.removeLast();
        }
    }
}
