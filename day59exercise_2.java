package day59;

import java.util.HashSet;
import java.util.Set;
//leetcode 804 摩尔斯密码
public class day59exercise_2 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String str : words){
            StringBuilder sb = new StringBuilder();
            for(char c : str.toCharArray()){
                sb.append(arr[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
