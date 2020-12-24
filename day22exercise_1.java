package day22;

import java.util.HashSet;

//        给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
//        交换字母的定义是取两个下标 i 和 j （下标从 0 开始），只要 i!=j 就交换 A[i] 和 A[j] 处的字符。例如，在 "abcd" 中交换下标 0 和下标 2 的元素可以生成 "cbad" 。
public class day22exercise_1 {
    public boolean buddyStrings(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();

        //如果俩字符串长度不同，或者字符串长度小于2
        if (lenA != lenB || lenA < 2 || lenB < 2)
            return false;

        //如果俩字符串相同，并且存在重复字符，返回true
        if (A.equals(B)) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < lenA; i++) {
                if (set.contains(A.charAt(i)))
                    return true;
                else
                    set.add(A.charAt(i));
            }
            return false;
        }

        //如果俩字符串不同，进行判断
        int count = 0;    //计数不同的字符个数
        int pre = -1, post = -1;  //pre，post分别记录俩不同字符的位置
        for (int i = 0; i < lenA; i++) {
            if (count > 2) {
                return false;
            }
            if (A.charAt(i) == B.charAt(i))
                continue;
            else {
                ++count;
                if (pre == -1)
                    pre = i;
                else
                    post = i;
            }

        }
        return count == 2 && A.charAt(pre) == B.charAt(post) && A.charAt(post) == B.charAt(pre);
    }
}