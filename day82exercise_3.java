package day82;
import java.util.*;
/*
某比赛已经进入了淘汰赛阶段,已知共有n名选手参与了此阶段比赛，他们的得分分别是a_1,a_2….a_n,小美作为比赛的裁判希望设定一个分数线m，使得所有分数大于m的选手晋级，其他人淘汰。

但是为了保护粉丝脆弱的心脏，小美希望晋级和淘汰的人数均在[x,y]之间。

显然这个m有可能是不存在的，也有可能存在多个m，如果不存在，请你输出-1，如果存在多个，请你输出符合条件的最低的分数线。
输入第一行仅包含三个正整数n,x,y，分别表示参赛的人数和晋级淘汰人数区间。(1<=n<=50000,1<=x,y<=n)

输入第二行包含n个整数，中间用空格隔开，表示从1号选手到n号选手的成绩。(1<=|a_i|<=1000)
 */
public class day82exercise_3 {
    static int n;
    static int x;
    static int y;
    static int[] arr;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        x = scan.nextInt();
        y = scan.nextInt();
        arr = new int[n];
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        if(n < x + x || n > y + y){
            System.out.println("-1");
            return;
        }
        for(int i = 0; i < n; i ++){
            arr[i] = scan.nextInt();
            left = Math.min(arr[i],left);
            right = Math.max(arr[i],right);
        }

        while(left < right){
            int mid = left + right  >> 1;
            if(check(mid)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        System.out.println(left);
    }
    public static boolean check(int num){
        int res = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] <= num){
                res ++;
            }
        }
        return res >= x;
    }
}
