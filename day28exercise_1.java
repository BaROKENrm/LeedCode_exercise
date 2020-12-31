package day28;
//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
public class day28exercise_1 {
    public static void main(String[] args) {
        char a = 'a' - 'B';
        System.out.println(a);
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a';
            table[num]++;
        }
        for (int i = 0; i < s.length(); i++) {
            int num = t.charAt(i) - 'a';
            table[num]--;
            if(table[num] < 0){
                return false;
            }
        }
        return true;
    }
}