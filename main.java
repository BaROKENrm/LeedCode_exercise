//A="aba”，B=“b”。这里有4种把B插入A的办法:*在A的第—个字母之前: "baba"不是回文
//        *在第一个字母'a'之后: "abba"是回文*在字母‘b'之后: "abba”是回文
//        *在第二个字母'a'之后"abab”不是回文所以满足条件的答案为2
import java.util.*;

public class main {
    //判断是否是回文字符串
    public static boolean isHui(String  s){
        if(s == null){
            return false;
        }
        int len = s.length();
        char[] ch = s.toCharArray();
        int start = 0;
        int end = len - 1;
        while(start < end){
            if(ch[start] != ch[end]){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanA = new Scanner(System.in);
        Scanner scanB = new Scanner(System.in);
        String A = scanA.nextLine();
        String B = scanB.nextLine();
        int count = 0;
        if(B == null){
            System.out.println("没有输入插入的字符串");
             return;
        }
        for (int i = 0; i <= A.length(); i++) {
            StringBuilder sbA = new StringBuilder(A);
            String str = sbA.insert(i,B).toString();
            if(isHui(str)){
                count ++;
            }
    }
        System.out.println(count);
    }
}
