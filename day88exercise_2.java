package day88;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//剑指 Offer 46. 把数字翻译成字符串
public class day88exercise_2 {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int len = s.length();
        int[] f = new int[len + 1];
        f[0] = 1;
        f[1] = 1;
        for(int i = 2; i <= len; i ++){
            String temp = s.substring(i - 2,i);
            if(temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0){
                f[i] = f[i - 2] + f[i -1];
            }
            else{
                f[i] = f[i -1];
            }
        }
        return f[len];
    }

}
