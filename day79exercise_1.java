package day79;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
//leetcode 227. 基本计算器 II
public class day79exercise_1 {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char flag = '+';
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                num = num * 10 + s.charAt(i) - '0';
            }

            if(!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == s.length() - 1){
                switch(flag){
                    case'+':
                        stack.push(num);
                        break;

                    case'-':
                        stack.push(-num);
                        break;

                    case'*':
                        stack.push(stack.pop() * num);
                        break;

                    default:
                        stack.push(stack.pop() / num);
                }
                num = 0;
                flag = s.charAt(i);
            }

        }

        int ret = 0;
        while(!stack.isEmpty()){
            ret += stack.pop();
        }
        return ret;
    }
}
