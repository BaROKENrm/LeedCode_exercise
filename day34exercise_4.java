package day34;

import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class day34exercise_4 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            boolean[] flag = new boolean[nums.length];
            dfs(i,0,nums,flag,ret,list);
        }
        return ret;
    }
    private void dfs(int size,int index ,int[] nums,boolean[] flag,List<List<Integer>> ret,ArrayList<Integer> list){
        if(size == list.size()){
            ret.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            flag[i] = true;
            dfs(size,i + 1,nums,flag,ret,list);
            flag[i] = false;
            list.remove(list.size() - 1);
        }
    }
}


