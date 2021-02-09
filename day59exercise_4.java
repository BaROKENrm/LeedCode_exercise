package day59;
//剑指 Offer 12. 矩阵中的路径
public class day59exercise_4 {
    int m,n;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        char[] arr = word.toCharArray();
        for(int i = 0; i < m;i++){
            for(int j = 0;j < n;j++){
                if (dfs(board,i,j,0,arr)) return true;
            }
        }
        return false;

    }

    public boolean dfs(char[][] board,int x,int y, int index,char[] arr){
        if(x >= m || x < 0 || y >= n || y < 0 || board[x][y] != arr[index]) return false;
        if(index == arr.length - 1) return true;

        board[x][y] = '1';
        boolean res = dfs(board,x + 1,y,index + 1,arr) || dfs(board,x - 1,y,index + 1,arr)||dfs(board,x,y + 1,index + 1,arr)||dfs(board,x,y - 1,index + 1,arr);
        board[x][y] = arr[index];
        return res;
    }
}
