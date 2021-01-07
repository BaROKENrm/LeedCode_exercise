package day32;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

//给定一个以字符串表示的非负整数 num，移除这个数中的 k 位数字，使得剩下的数字最小。
public class day32exercise_1 {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            char ch = num.charAt(i);
            while (!deque.isEmpty() && k > 0 && deque.peekLast() > ch) {
                deque.pollLast();
                k--;
            }
            deque.offerLast(ch);
        }
            for (int j = 0; j < k; j++) {
                deque.pollLast();
            }
            StringBuilder ret = new StringBuilder();
            boolean isZero = true;
            //去除开头是0的情况
            while(!deque.isEmpty()){
                char digit = deque.pollFirst();
                if(isZero && digit == '0'){
                    continue;
                }
                isZero = false;
                ret.append(digit);
            }
            return ret.length() == 0 ? "0" : ret.toString();
    }
}
