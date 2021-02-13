package day60;

import java.util.Scanner;

public class day60exercise_2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();
        int ret = 0;
        for(int i = L; i <= R; i++){
            for(int j = i; j > 0; j /= 10){
                if(j % 10 == 2){
                    ret++;

                }
            }

        }
        System.out.println(ret);
    }
}
