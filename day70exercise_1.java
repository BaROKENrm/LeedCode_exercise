package day70;

import java.util.HashMap;
import java.util.Map;
//395. 至少有 K 个重复字符的最长子串
public class day70exercise_1 {
    public int longestSubstring(String s, int k) {
        if(k > s.length()) return 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        for(char c : map.keySet()){
            if(map.get(c) < k){
                int max = 0;
                for (String str:s.split(String.valueOf(c))) {
                    max = Math.max(max,longestSubstring(str,k));
                }
                return max;
            }
        }
        return s.length();
    }
}
