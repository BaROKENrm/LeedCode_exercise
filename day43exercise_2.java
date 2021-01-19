package day43;
//leetcode 1317
public class day43exercise_2 {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if(isTen(i) && isTen(n - i)){
                return new int[]{i,n - i};
            }
        }
        return null;
    }
    public boolean isTen(int x){
        while(x != 0){
            int temp = x % 10;
            if(temp == 0){
                return false;
            }
            x /= 10;
        }
        return true;
    }
}
