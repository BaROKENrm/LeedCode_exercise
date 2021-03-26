package day94;

import java.util.ArrayList;
import java.util.List;
//139. 单词拆分
public class day94exercise_2 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] f = new boolean[len + 1];
        for(int i = 1; i <= len; i ++){
            if(wordDict.contains(s.substring(0,i))){
                f[i] = true;
                continue;
            }
            for(int j = 0; j < i; j ++){
                if(f[j] && wordDict.contains(s.substring(j,i))){
                    f[i] = true;
                }
            }
        }
        return f[len];
    }

}
