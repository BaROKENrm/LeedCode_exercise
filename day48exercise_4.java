package day48;
//剑指offer 04
public class day48exercise_4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0 || matrix == null){
            return false;
        }
        int rLen = matrix.length;
        int cLen = matrix[0].length;
        int rStart = 0;
        int cStart = cLen - 1;
        while(rStart < rLen && cStart >= 0){
            if(target == matrix[rStart][cStart]){
                return true;
            }
            if(target > matrix[rStart][cStart]){
                rStart++;
            }
            else if(target < matrix[rStart][cStart]){
                cStart--;
            }
        }
        return false;
    }
}
