package day07;

import java.util.Scanner;

//        n个数里出现次数大于等于n/2的数
//        输入n个整数，输出出现次数大于等于数组长度一半的数。
//每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。
public class day07exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String s = scan.nextLine();
            String[] str = s.split(" ");
            int[] arr = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.valueOf(str[i]);
            }
            int n = arr.length;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > n / 2 || arr[j] == n / 2) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
