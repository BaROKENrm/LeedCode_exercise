package day68;
//leetcode 832翻转图像
public class day68exercise_1 {
    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length;
        int col = A[0].length;

        int[][] ret = new int[row][col];

        for(int i = 0; i < row;i++){
            int count = 0;
            for(int j = col - 1; j >= 0;j--){
                ret[i][count] = A[i][j];
                count++;
            }
        }

        for(int i = 0; i < row;i++){
            for(int j = 0; j < row;j++){
                if(ret[i][j] == 1){
                    ret[i][j] = 0;
                }
                else{
                    ret[i][j] = 1;
                }
            }
        }
        return ret;
    }
}
