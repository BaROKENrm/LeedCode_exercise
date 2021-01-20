package day44;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
//        给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。//
public class day44exercise_2 {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length() == 0){
            return list;
        }
        Map<Character,String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        StringBuffer sb = new StringBuffer("");
        dfs(list,map,digits,0,sb);
        return list;
    }
    public void dfs(List<String> list,Map<Character,String> map,String digits,int index,StringBuffer sb){
        if(index == digits.length()){
            list.add(sb.toString());
            return;
        }
        char ch = digits.charAt(index);
        String s = map.get(ch);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            sb.append(s.charAt(i));
            dfs(list,map,digits,index + 1,sb);
            sb.deleteCharAt(index);
        }
    }
}
