package day87;

import java.util.Stack;
//逆波兰表达式
public class day87exercise_1 {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack1 = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int a = stack1.pop();
                int b = stack1.pop();
                stack1.push(a + b);
            }
            else if(s.equals("-")){
                int a = stack1.pop();
                int b = stack1.pop();
                stack1.push(b - a);
            }
            else if(s.equals("*")){
                int a = stack1.pop();
                int b = stack1.pop();
                stack1.push(a * b);
            }
            else if(s.equals("/")){
                int a = stack1.pop();
                int b = stack1.pop();
                stack1.push(b / a);
            }
            else{
                stack1.push(Integer.valueOf(s));
            }
        }
        return stack1.pop();
    }
}
