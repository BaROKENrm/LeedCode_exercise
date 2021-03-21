package day88;

import java.util.HashMap;
import java.util.Map;
//剑指 Offer 50. 第一个只出现一次的字符
public class day88exercise_4 {
    public char firstUniqChar(String s) {
        int len = s.length();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < len; i ++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        for(int i = 0; i < len; i ++){
            if(map.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
