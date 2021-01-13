package day38;

import java.util.*;

//    给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
//
//    candidates 中的每个数字在每个组合中只能使用一次。
public class day38exercise_3 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        Arrays.sort(candidates);
        List<List<Integer>> ret =  new ArrayList<>();
        Deque deque = new ArrayDeque();
        dfs(ret,deque,candidates,len,0,target);
        return ret;
    }
    public void dfs(List<List<Integer>> ret,Deque deque,int[] candidates,int len,int index,int target){
        if(target == 0){
            ret.add(new ArrayList<>(deque));
            return;
        }
        for (int i = index; i < len; i++) {
            if(target - candidates[i] < 0 ){
                break;
            }
            if(i > index && candidates[i] == candidates[i - 1]){
                continue;
            }
            deque.addLast(candidates[i]);
            dfs(ret,deque,candidates,len,i + 1,target - candidates[i]);
            deque.removeLast();
        }
    }
}
