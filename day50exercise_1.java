package day50;

import java.util.*;
public class day50exercise_1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(isNum(n)){
                System.out.println("Yes!");
            }
            else{
                System.out.println("No!");
            }
        }
    }


    public static boolean isNum(int n){
        int a = n * n;
        while(n != 0){
            if(n % 10 == a % 10){
                n = n / 10;
                a = a / 10;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
