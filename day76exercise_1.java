package day76;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
//131. 分割回文串 
public class day76exercise_1 {

    List<List<String>> ret = new ArrayList<>();
    List<String> list = new ArrayList<>();
    int len;
    public List<List<String>> partition(String s) {
        len = s.length();
        dfs(s,0);
        return ret;
    }

    public void dfs(String s,int index){
        if(index == len){
            ret.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < len; i++){
            String str = s.substring(index,i + 1);
            if(!helper(str)){
                continue;
            }
            list.add(str);
            dfs(s,i + 1);
            list.remove(list.size() - 1);
        }
    }


    public boolean helper(String s){
        if( s == null ||s.length() <= 1){
            return true;
        }
        int n = s.length();
        int left = 0;
        int right = n - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
