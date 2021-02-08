package day58;
//输入1行，包含7个整数，分别表示吃不同包子的速度和不同包子的个数和保留的位数。
import java.text.DecimalFormat;
import java.util.*;
public class day58exercise_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = scan.nextInt();
        }

        double a = arr[3] / (arr[0] * 1.00);
        double b = arr[4] / (arr[1] * 1.00);
        double c = arr[5] / (arr[2] * 1.00);
        double ret = a + b + c;
        DecimalFormat df = new DecimalFormat("#.00");
        //df.setMinimumFractionDigits(arr[6]);
        String str = df.format(ret);
        System.out.println(str);
    }
}
