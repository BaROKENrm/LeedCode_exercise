package day53;

import java.io.*;
import java.util.Stack;

public class day53exercise_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = bf.readLine().split(" ");
        Stack<String> stack = new Stack<>();
        for (String str:s) {
            stack.push(str);
        }
        StringBuilder sb = new StringBuilder(" ");
        while(!stack.isEmpty()){
            sb = sb.append(stack.pop());
            sb.append(" ");
        }
        bw.write(sb.toString().trim());

        bf.close();
        bw.flush();
        bw.close();
    }
}
