package day34;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

//给定一个 没有重复 数字的序列，返回其所有可能的全排列。
public class day34exercise_3 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<Integer>();
        boolean[] flag = new boolean[nums.length];
        dfs(ret,deque,nums,flag,0);
        return ret;
    }
    public void dfs( List<List<Integer>> ret,Deque<Integer> deque,int nums[],boolean[] flag,int index){
        if(index == nums.length){
            ret.add(new ArrayList<>(deque));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(flag[i] == false){
                deque.addLast(nums[i]);
                flag[i] = true;
                dfs( ret,deque, nums, flag, index + 1);
                flag[i] = false;
                deque.removeLast();
            }
        }
    }
}

//    private void dfs(int[] nums, int len, int depth,
//                     Deque<Integer> path, boolean[] used,
//                     List<List<Integer>> res) {
//        if (depth == len) {
//            res.add(new ArrayList<>(path));
//            return;
//        }
//
//        for (int i = 0; i < len; i++) {
//            if (!used[i]) {
//                path.addLast(nums[i]);
//                used[i] = true;
//
//                System.out.println("  递归之前 => " + path);
//                dfs(nums, len, depth + 1, path, used, res);
//
//                used[i] = false;
//                path.removeLast();
//                System.out.println("递归之后 => " + path);
//            }
//        }
//
//
//        作者：liweiwei1419
//        链接：https://leetcode-cn.com/problems/permutations/solution/hui-su-suan-fa-python-dai-ma-java-dai-ma-by-liweiw/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。