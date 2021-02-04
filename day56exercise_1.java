package day56;

import java.util.Scanner;
//分解质因数

public class day56exercise_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n > 0){
            int x = scan.nextInt();
            di(x);
            n--;
        }
    }

    public static void di(int n){
        for(int i = 2;i <= n / i ;i++){
            if(n % i == 0){
                int s = 0;
                while(n % i == 0){
                    n /= i;
                    s++;
                }

                System.out.printf("%d %d\n",i,s);
            }
        }
        if(n > 1){
            System.out.printf("%d %d\n",n,1);
        }
        System.out.println();
    }
}
