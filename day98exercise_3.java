package day98;
// 74. 搜索二维矩阵
public class day98exercise_3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l = 0;
        int r = m * n - 1;
        while(l <= r){
            int mid = l + r >> 1;
            int x = matrix[mid / m][mid % m];
            if(x > target){
                r = mid - 1;
            }
            else if(x < target){
                l = mid + 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
