package day55;
//leetcode 680
public class day55exercise_2 {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return (isHui(s,i + 1,j)) || (isHui(s,i ,j - 1));
            }
            i ++;
            j --;
        }
        return true;
    }


    public boolean isHui(String s,int i,int j){
        for (int k = i; k <= i + (j - i) / 2; k++) {
            if(s.charAt(k) != s.charAt(j - k + i))
            return false;
        }
        return true;
    }
}
