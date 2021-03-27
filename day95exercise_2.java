package day95;

//剑指 Offer 58 - I. 翻转单词顺序
public class day95exercise_2 {
    public String reverseWords(String s) {
        s = s.trim();
        int len = s.length();
        int i = len - 1;
        int j = len - 1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0){
            while(i >= 0 && s.charAt(i) != ' '){
                i --;
            }
            sb.append(s.substring(i + 1,j + 1) + " ");
            while(i >= 0 && s.charAt(i) == ' '){
                i --;
            }
            j = i;
        }
        return sb.toString().trim();
    }
}
