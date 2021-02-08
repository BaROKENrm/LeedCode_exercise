package day58;
//leetcode 130
public class day58exercise_4 {
    int n,m;
    public void solve(char[][] board) {
        n = board.length;//行
        m = board[0].length;//列
        for(int i = 0; i < n;i++){
            dfs(board,i,0);
            dfs(board,i,m - 1);
        }

        for(int i = 0; i < m;i++){
            dfs(board,0,i);
            dfs(board,n - 1,i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 'A'){
                    board[i][j] = 'O';
                }
                else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

    }

    public void dfs(char[][] board,int x,int y){
        if(x >= n || x < 0 || y >= m || y < 0 || board[x][y] != 'O'){
            return;
        }
        board[x][y] = 'A';
        dfs(board,x + 1 ,y);
        dfs(board,x - 1,y);
        dfs(board,x,y + 1);
        dfs(board,x,y - 1);
    }
}
