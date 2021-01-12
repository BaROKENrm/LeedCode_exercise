package day37;
//还记得童话《卖火柴的小女孩》吗？现在，你知道小女孩有多少根火柴，请找出一种能使用所有火柴拼成一个正方形的方法。不能折断火柴，可以把火柴连接起来，并且每根火柴都要用到。
//
//        输入为小女孩拥有火柴的数目，每根火柴用其长度表示。输出即为是否能用所有的火柴拼成正方形。

public class day37exercise_3 {
    public boolean makesquare(int[] nums) {
        if(nums.length == 0 || nums == null){
            return false;
        }
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum + nums[i];
        }
        if(sum % 4 != 0){
            return false;
        }
        int n = sum / 4;
        return dfs(nums,0,0,0,0,0,n);
    }
    public boolean dfs(int[] nums,int index, int a,int b,int c,int d,int n){
        if(index == nums.length){
            return a == n && b == n && c == n && d == n;
        }
        if(a > n || b > n || c > n || d > n){
            return false;
        }
        return dfs(nums,index + 1,a + nums[index] ,b,c,d,n)
                || dfs(nums,index + 1,a  ,b+ nums[index],c,d,n)
                || dfs(nums,index + 1,a, b,c + nums[index],d,n)
                || dfs(nums,index + 1,a  , b,c,d + nums[index],n);
    }
}
