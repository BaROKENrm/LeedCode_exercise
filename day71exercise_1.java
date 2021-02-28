package day71;
//leetcode 1260. 二维网格迁移
import java.util.ArrayList;
import java.util.List;

public class day71exercise_1 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        int row = grid.length;
        int col = grid[0].length;
        while(k -- > 0){
            int[][] arr = new int[row][col];
            for(int i = 0;i < row; i++){
                for(int j = 0; j < col - 1; j++){
                    arr[i][j + 1] = grid[i][j];
                }
            }


            for(int i = 0; i < row - 1; i++){
                arr[i + 1][0] = grid[i][col - 1];
            }

            arr[0][0] = grid[row - 1][col - 1];
            grid = arr;
        }


        for(int i = 0 ; i < row; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < col; j++){
                list.add(grid[i][j]);
            }
            ret.add(list);
        }
        return ret;
    }
}
