package day55;

import java.util.Arrays;
import java.util.Scanner;

public class day55exercise_1 {
    static int N = 100010;
    static int n, m;
    // 采用邻接表来存储稀疏图。因为是稀疏图点比较多
    static int h[] = new int[N], e[] = new int[N], ne[] = new int[N], w[] = new int[N], idx = 0;
    // dist[i]: i表示离1号点的距离
    static int[] dist = new int[N];
    // st集合：防止队列存储重复的点的编号
    static boolean[] st = new boolean[N];
    // 用INF表示正无穷
    static int INF = 0x3f3f3f3f;
    // 采用数组模拟队列
    static int[] q = new int[N];

    // idx可以看成表示的是边
    static void add(int a, int b, int c) {
        e[idx] = b;
        // 权重
        w[idx] = c;
        ne[idx] = h[a];
        h[a] = idx ++;
    }


    static int spfa() {
        // 初始化距离为INF
        Arrays.fill(dist, INF);
        // 初始化第一个点为0
        dist[1] = 0;
        // 定义一个队列,队列里面存储的是节点的编号
        int hh = 0, tt = -1;
        // 加入1号点
        q[++ tt] = 1;

        // 当队列不为空，就一直循环，队列里面存储的是被更新过的节点，
        // 只有被更新过的节点才可能更新与它相连的节点
        while (hh <= tt) {
            // 取出队头元素
            int t = q[hh ++];
            // 标志为false，让这个点可以再次加入队列
            st[t] = false;

            /* 重边不会被影响到，dist数组里面最后肯定是存储最小的，而且队列里面存储的点的编号，
             * 在最终更新其他点的时候，是用的肯定是最小的dist[i]
             *
             * 因为队头这个点被更新过，所以与它相连的其他点的距离可能也会被更新。
             */
            for(int i = h[t]; i != -1; i = ne[i]) {
                int j = e[i];

                if(dist[j] > dist[t] + w[i]) {

                    dist[j]  = dist[t] + w[i];
                    // 如果这个点没有加入队列，这里是防止点重复被加入。加快执行速度
                    if(!st[j]) {
                        q[++ tt] = j;
                        // 标志这个点已经被加入队列
                        st[j] = true;
                    }
                }
            }
        }
        // 如果这个点不可达，就一定不会被更新，哪怕有一个点和他相连，
        // 但是相连的那个点是不可达的，所以这个点也不会被更新。
        if (dist[n] == INF) return -1;
        return dist[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        // 初始化
        Arrays.fill(h, -1);

        while(m -- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            // 这里可以不用管重边。原因在上面的for循环
            add(a, b, c);
        }
        int t = spfa();
        if (t == -1) System.out.println("impossible");
        else System.out.println(t);
    }

}
