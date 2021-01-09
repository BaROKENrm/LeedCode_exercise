package day34;
//给定一个二维网格和一个单词，找出该单词是否存在于网格中。
//
//        单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。

public class day34exercise_2 {
    public boolean exist(char[][] board, String word) {
        if(board.length == 0 || board[0].length == 0){
            return false;
        }
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(check(board,words,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean check(char[][] board,char[] word, int i ,int j,int index){
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[index]){
            return false;
        }
        if(index == word.length - 1){
            return true;
        }
        char temp = board[i][j];
        board[i][j] = '.';//记录已经用过了
        boolean res = check(board, word, i + 1, j, index + 1) || check(board, word, i - 1, j, index + 1) ||
                check(board, word, i, j + 1, index + 1) || check(board, word, i, j - 1, index + 1);

        board[i][j] = temp;
        return res;
    }
}

