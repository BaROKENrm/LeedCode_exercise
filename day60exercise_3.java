package day60;
//剑指offer13 机器人运动
public class day60exercise_3 {
    public int movingCount(int m, int n, int k) {
        boolean[][] flag = new boolean[m][n];

        return dfs(0,0,m,n,flag,k);
    }



    public int dfs(int i,int j,int m,int n,boolean[][] flag,int k){
        if(i < 0 || i >= m || j < 0 || j >= n || fun(i , j ,k) || flag[i][j]){
            return 0;
        }
        flag[i][j] = true;
        return dfs(i + 1 , j,m,n,flag,k) + dfs(i - 1, j,m,n,flag,k) + dfs(i , j + 1,m,n,flag,k) + dfs(i , j - 1,m,n,flag,k) + 1;
    }



    public boolean fun(int m,int n,int k){
        int sum = 0;
        while(m != 0){
            sum += (m % 10);
            m /= 10;
        }

        while(n != 0){
            sum += (n % 10);
            n /= 10;
        }
        if(sum > k){
            return true;
        }
        return false;
    }
}
