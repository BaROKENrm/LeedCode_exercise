package day03;
import java.util.Scanner;

//读入一个字符串str，输出字符串str中的连续最长的数字串
public class day03exercise_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();
            int count = 0;           //表示数字计数器，当出现字母是 置为0
            int end = 0;             //记录数字结束的位置
            int max = 0;             //记录最大的连续数字
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    count++;
                    if (max < count) {
                        max = count;
                        end = i;
                    }
                }
                else{
                        count = 0;
                    }
            }
        System.out.println(str.substring(end-max+1,end+1));}
    }
}

