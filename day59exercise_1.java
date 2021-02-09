package day59;

import java.util.Scanner;

public class day59exercise_1 {
    static int N = 510;
    static int n,m;
    static int[][] g = new int[N][N];
    static int[] dist = new int[N];
    static boolean[] st = new boolean[N];
    static int prim(){
        for(int i=0;i<N;i++){
            dist[i]=0x3f3f3f3f;
        }
        int res = 0;
        for(int i=0;i<n;i++){
            int t = -1;
            for(int j=1;j<=n;j++){
                if(!st[j] && (t==-1 || dist[t]>dist[j])){
                    t = j;
                }
            }
            if(i>0 && dist[t]==0x3f3f3f3f)    return 0x3f3f3f3f;
            if(i>0) res+=dist[t];
            for(int j=1;j<=n;j++){
                dist[j] = Math.min(dist[j],g[t][j]);
            }
            st[t]=true;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                g[i][j]=0x3f3f3f3f;
            }
        }
        while(m-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            g[x][y] = Math.min(g[x][y], z);
            g[y][x] = Math.min(g[y][x], z);
        }
        int t = prim();
        if(t==0x3f3f3f3f)   System.out.print("impossible");
        else System.out.print(t);
    }
}
