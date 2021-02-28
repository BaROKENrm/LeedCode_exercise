package day71;
//leetcode 896. 单调数列
public class day71exercise_2 {
    public boolean isMonotonic(int[] A) {
        int len = A.length;
        if(len == 1){
            return true;
        }
        boolean flag1 = true;
        boolean flag2 = true;
        for(int i = 0; i < len - 1; i++){
            if(A[i + 1] > A[i]){
                flag1 = false;
            }
            if(A[i + 1] < A[i]){
                flag2 = false;
            }
        }
        return flag1 || flag2;
    }
}
