package day13;
//给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。

public class day13exercise_2 {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        for (int i = 0; i < h - n + 1; i++) {
            if(haystack.substring(i,i + n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
