package day84;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//剑指 Offer 38. 字符串的排列
public class day84exercise_1 {

    static List<String> list = new ArrayList<>();
    static boolean[] flag;
    static int len;
    static char[] ch;

    public static void main(String[] args) {
        String s = "aab";
        String[] ret = permutation(s);
        for(String str : ret){
            System.out.println(str);
        }
    }


    public static String[] permutation(String s) {
        len = s.length();
        flag = new boolean[len];
        ch = s.toCharArray();
        Arrays.sort(ch);
        for(int i = 0 ; i < len; i ++){
            flag[i] = true;
            StringBuffer sb = new StringBuffer();
            sb.append(ch[i]);
            dfs(sb);
            flag[i] = false;
        }
        return list.toArray(new String[list.size()]);
    }

    public static void dfs(StringBuffer sb){
        if(sb.length() == len){
            list.add(sb.toString());
            return;
        }
        for(int i = 0; i < len; i ++){
            if(!flag[i]){
                if(i > 0 && ch[i] == ch[i - 1] && flag[i - 1]){
                    continue;
                }
                flag[i] = true;
                sb.append(ch[i]);
                dfs(sb);
                flag[i] = false;
                sb.deleteCharAt(sb.length() - 1);
            }

        }
    }
}
