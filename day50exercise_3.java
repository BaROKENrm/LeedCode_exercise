package day50;

import java.text.DecimalFormat;

//leetcode 867
public class day50exercise_3 {

    public int[][] transpose(int[][] A) {
        int r = A.length;
        int c = A[0].length;
        int[][] ret = new int[c][r];
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                ret[j][i] = A[i][j];
            }
        }
        return ret;
    }
}
