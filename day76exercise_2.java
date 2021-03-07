package day76;


import java.util.Arrays;

public class day76exercise_2 {
    static final int N = 100010;
    static int M = N * 2;
    static int[] h = new int[N];
    static int[] e = new int[M];
    static  int[] ne = new int[M];
    static int index;

    public void add(int a,int b){
        e[index] = b;
        ne[index] = h[a];
        h[a] = index ++;
    }
    public static void main(String[] args) {
        Arrays.fill(h,-1);
    }
}
