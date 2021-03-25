package day93;

import java.util.Comparator;
import java.util.PriorityQueue;
//132. 分割回文串 II
public class day93exercise_1 {
    public int minCuT(String s){
        int len = s.length();
        if(len < 2){
            return 0;
        }
        int[] f = new int[len];
        char[] ch = s.toCharArray();
        for(int i = 0; i < len; i ++){
            f[i] = i;
            if(check(ch,0,i)){
                f[i] = 0;
                continue;
            }
            for(int j = 0; j <= i; j ++){
                if(check(ch,j + 1,i)){
                    f[i] = Math.min(f[i],f[j] + 1);
                }
            }
        }
        return f[len - 1];
    }

    public boolean check(char[] ch ,int i,int j){
        while(i < j){
            if(ch[i] != ch[j]){
                return false;
            }
        }
        return true;
    }
}
