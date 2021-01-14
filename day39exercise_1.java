package day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
//leetcode47
public class day39exercise_1 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        boolean[] flag = new boolean[len];
        dfs(ret,list,nums,len,flag,0);
        return ret;

    }
    public void dfs( List<List<Integer>> ret,List<Integer> list,int[] nums,int len,boolean[] flag,int index){
        if(index == len){
            ret.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < len; i++) {
            if(flag[i] == true|| (i > 0) && (nums[i] == nums[i - 1] && flag[i - 1] == false)){
                continue;
            }
                list.add(nums[index]);
                flag[i] = true;
                dfs(ret,list,nums,len,flag,index + 1);
                flag[i] = false;
                list.remove(index);
        }
    }
}
