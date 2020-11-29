package day03;

import java.util.Scanner;
import java.util.Stack;

//        对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
//        给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
//        一个合法的括号串定义为：1.只包括括号字符；2.左括号和右括号一一对应
public class day03exercise_2 {
    public static boolean chkParenthesis(String str, int n){
        if(str == null || str.length() != n){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < n; i++) {
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')'){
                if(stack.empty()){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            else{
                return false;
            }
        }
        if(!stack.empty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = str.length();
        boolean res = chkParenthesis(str,n);

    }
}
