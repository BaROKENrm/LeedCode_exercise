package day78;

import java.util.Stack;
//1047. 删除字符串中的所有相邻重复项
public class day78exercise_1 {
    public String removeDuplicates(String S) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        char[] ch = S.toCharArray();
        for(int i = 0; i < S.length(); i++){
            if(stack.isEmpty() || stack.peek() != ch[i]){
                stack.push(ch[i]);
            }
            else{
                stack.pop();
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();

    }
}
