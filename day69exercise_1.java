package day69;
//867. 转置矩阵
public class day69exercise_1 {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] ret = new int[c][r];
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                ret[j][i] = matrix[i][j];
            }
        }
        return ret;
    }
}
