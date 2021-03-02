package day73;

import java.util.ArrayList;
import java.util.List;
//leetcode 22 括号生成
public class day73exercise_2 {
    List<String> ret;
    StringBuffer sb;


    public List<String> generateParenthesis(int n) {
        ret = new ArrayList<>();
        sb = new StringBuffer();
        dfs(0,0,n);
        return ret;
    }


    public void dfs(int left,int right,int len){
        if(sb.length() == len * 2){
            ret.add(sb.toString());
            return;
        }


        if(left < len){
            sb.append("(");
            dfs(left + 1,right,len);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(right < left){
            sb.append(")");
            dfs(left,right + 1,len);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
