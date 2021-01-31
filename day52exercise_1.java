package day52;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class day52exercise_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int left = minLeft(arr[i],i,arr);
            int right = minRight(arr[i],i,arr);
            System.out.printf("%d %d",left,right);
            System.out.println();
        }



    }

    public static int minRight(int num,int size,int[] arr){
        for (int i = size + 1; i < arr.length; i++) {
            if(arr[i] < num){
                return i;
            }
        }
        return -1;
    }

    public static int minLeft(int num, int size,int[] arr){
        for (int i = size - 1; i >= 0; i--) {
            if(arr[i] < num){
                return i;
            }
        }
        return -1;
    }

//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0;i < n;i++){
//            arr[i] = scan.nextInt();
//        }
//        Set<Integer> set = new HashSet<>();
//        for(int i = 0;i < n; i++){
//            if(set.contains(arr[i])){
//                set.remove(arr[i]);
//            }
//            else{
//                set.add(arr[i]);
//            }
//        }
//
//        int[] ret = new int[set.size()];
//        int count = 0;
//        for (int num:set) {
//            ret[count] = num;
//            count++;
//        }
//        Arrays.sort(ret);
//        for (int i = 0; i < ret.length; i++) {
//            System.out.printf("%d ",ret[i]);
//        }
//    }
}
