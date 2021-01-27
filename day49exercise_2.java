package day49;

import java.io.*;
import java.util.Scanner;

public class day49exercise_2 {
//    一共有n个数，编号是1~n，最开始每个数各自在一个集合中。
//
//    现在要进行m个操作，操作共有两种：
//
//            “M a b”，将编号为a和b的两个数所在的集合合并，如果两个数已经在同一个集合中，则忽略这个操作；
//            “Q a b”，询问编号为a和b的两个数是否在同一个集合中；
//    输入格式
//    第一行输入整数n和m。
//
//    接下来m行，每行包含一个操作指令，指令为“M a b”或“Q a b”中的一种。
//
//    输出格式
//    对于每个询问指令”Q a b”，都要输出一个结果，如果a和b在同一集合内，则输出“Yes”，否则输出“No”。
//
//    每个结果占一行。


//存储每个元素的祖宗点
        static int N = 100010;
         static int[] p = new int[N];
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = reader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);

        //初始化 每个元素的祖宗点都是自己
        for (int i = 0; i < n; i++) {
            p[i] = i;
        }
        int m = Integer.parseInt(s[1]);
        for (int i = 0; i < m; i++) {
            s = reader.readLine().split(" ");
            if(s[0].equals("M")){//合并集合
                int a = Integer.parseInt(s[1]);
                int b = Integer.parseInt(s[2]);
                meger(a,b);
            }
            else if(s[0].equals("Q")){//判断是否在同一个集合中
                int a = Integer.parseInt(s[1]);
                int b = Integer.parseInt(s[2]);
                boolean ans = isSameFather(a, b);
                writer.write(ans ? "Yes" : "No");
                writer.write("\n");
            }
        }
        reader.close();
        writer.flush();
        writer.close();
    }

    //返回x的祖宗节点，并且对路径进行压缩
    private static int find(int x) {
        if(p[x] != x){
            p[x] = find(p[x]);
        }
        return p[x];
    }

    // 让 a 节点的祖宗节点的 father 指针指向 b 节点的祖宗节点
    //合并两个集合
    private static void meger(int a, int b) {
        p[find(a)] = p[find(b)];
    }

    public static boolean isSameFather(int a,int b){
        return find(a) == find(b);
    }



}
