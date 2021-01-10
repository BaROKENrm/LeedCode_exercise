package day35;

import java.util.Scanner;

public class day35exercise_1 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[][] a = new int[n][n];
            int[][] dp = new int[n][n];
            for(int i = 0;i < n;i ++){
                for(int j = 0;j <=i;j++){
                    a[i][j] = in.nextInt();
                }
            }
            dp[0][0] = a[0][0];
            for(int i = 1;i < n;i++){
                for(int j = 0;j <= i;j++){
                    if(j == 0){
                        dp[i][j] = a[i][j]+dp[i-1][j+1];
                    }
                    else dp[i][j] =Math.max(a[i][j]+dp[i-1][j],a[i][j]+dp[i-1][j-1]);
                }
            }

            int max=Integer.MIN_VALUE;
            for(int i = 0;i<n-1;i++){
                for(int j = 0;j <= i;j++){
                    max = Math.max(dp[i][j],max);
                }
            }
            System.out.print(max);

        }
//        int count = 0;
//        for (int i = 1; i < 2020; i++) {
//            if(i % 4 ==0 && i % 6 ==0){
//                count++;
//            }
//        }
//        System.out.println(count);

//        LANQIAO
//        int len = 'l' - 'a' + 'n' - 'a' + 'q' - 'n' + 'i' - 'a' + 'o' - 'a';
//        System.out.println(len);
//        Scanner scan = new Scanner(System.in);
//        int l = scan.nextInt();
//        int h = scan.nextInt();
//        System.out.println(l * h);
//        Scanner scan = new Scanner(System.in);
//        int hour = scan.nextInt();
//        int minute = scan.nextInt();
//        int minute1 = scan.nextInt();
//        System.out.println(hour + minute1 / 60);
//        System.out.println(minute + minute1 % 60);


}
