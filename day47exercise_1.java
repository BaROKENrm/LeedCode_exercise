package day47;

import java.util.Arrays;
import java.util.Scanner;

public class day47exercise_1 {
    //从这里看，边是比较多的，所有可以用邻接矩阵存数据

    static int N = 510;
    static int m, n;
    static int[][] g = new int[N][N];
    static int[] dist = new int[N];
    static boolean[] st = new boolean[N];

    //注意：有向图和无向图相比，无向图可以看出有向图
    //如果有重边，保留距离最短的那条边
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();

        for (int i = 1; i <= n; i++) Arrays.fill(g[i], 0x3f3f); //权值不超过10000
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            g[a][b] = Math.min(g[a][b], c);
        }



        // 表示1号点到n号点的最短距离
        System.out.println(dijkstra());
    }

    private static int dijkstra() {
        Arrays.fill(dist, 0x3f3f);

        dist[1] = 0; //把自己的距离设置为 0

        //遍历一遍 找到一个最小的点，加入到集合中，这里加入到集合里，是通过st来做

        //迭代n次，n次迭代后获得最终结果集
        for (int i = 0; i < n; i++) {
            int t = -1; //表示还没有最短的点
            for (int j = 1; j <= n; j++) {
                if (!st[j] && (t == -1 || dist[t] > dist[j])) {
                    t = j;
                }
            } //循环后找到了最短的点，为 t

            st[t] = true; // t 加进结果集中

            //最后拿 t 更新一下结果集
            for (int j = 1; j <= n; j++) dist[j] = Math.min(dist[j], dist[t] + g[t][j]);
        }

        if (dist[n] == 0x3f3f) return -1;
        else return dist[n];
    }
}
