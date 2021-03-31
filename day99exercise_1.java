package day99;

import java.util.*;
//剑指 Offer 62. 圆圈中最后剩下的数字
public class day99exercise_1 {
    //旧 = （新 + m） % n
    public int lastRemaining(int n, int m) {
        if(n == 1){
            return 0;
        }
        return (lastRemaining(n - 1,m) + m) % n;
    }
}
