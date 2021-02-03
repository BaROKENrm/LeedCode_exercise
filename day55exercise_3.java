package day55;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.*;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class day55exercise_3 {
    static int N = 510;
    static int n,m;
    static int[][] g = new int[N][N];
    static int[] dist = new int[N];
    static boolean[] flag = new boolean[N];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            Arrays.fill(g[i],0x3f3f3f);
        }

        for (int i = 0; i < m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            g[a][b] = c;
        }
        System.out.println(dijkstra());

    }

    public static int dijkstra(){
        Arrays.fill(dist,0x3f3f3f);
        dist[1] = 0;

        for (int i = 0; i < n; i++) {
            int t = -1;
            for (int j = 1; j <= n; j++) {
                if(!flag[j] && (t == -1 || dist[t] > dist[j])){
                    t = j;
                }
            }

            flag[t] = true;

            for (int j = 1; j <= n; j++) {
                dist[j] = Math.min(dist[j], dist[t] + g[t][j]);
            }
        }
        if(dist[n] == 0x3f3f3f){
            return -1;
        }
        return dist[n];

    }
}
