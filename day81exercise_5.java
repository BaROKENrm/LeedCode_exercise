package day81;

public class day81exercise_5 {
    public int strToInt(String str) {
        char[] ch = str.trim().toCharArray();
        int flag = 1;
        int digit = 0;
        int res = 0;
        int start = 1;
        int bigNum = Integer.MAX_VALUE / 10;
        if(ch.length == 0) return 0;

        if(ch[0] == '-'){
            flag = -1;
        }
        else if(ch[0] != '+'){
            start = 0;
        }

        for(int i = start; i < ch.length; i++){
            if(ch[i] > '9' || ch[i] < '0'){
                break;
            }
            if(res > bigNum || res == bigNum && ch[i] > '7'){
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + ch[i] - '0';
        }
        return res * flag;
    }
}
