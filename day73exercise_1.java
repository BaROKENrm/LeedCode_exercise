package day73;
//leetcode 304. 二维区域和检索 - 矩阵不可变
public class day73exercise_1 {
    int[][] arr;
    public day73exercise_1(int[][] matrix) {
        int len = matrix.length;
        if(len > 0){
            int n = matrix[0].length;
            arr = new int[len][n + 1];
            for(int i = 0; i < len; i ++){
                for(int j = 0; j < n; j ++){
                    arr[i][j + 1] = arr[i][j] + matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int i = row1; i <= row2 ;i ++){
            sum += arr[i][col2 + 1] - arr[i][col1];
        }
        return sum;
    }
}
