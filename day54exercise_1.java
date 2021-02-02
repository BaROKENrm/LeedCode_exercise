package day54;
//leetcode 424
public class day54exercise_1 {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int len = s.length();
        int left = 0;
        int right = 0;
        int max = 0;
        for(right = 0; right < len;right++){
            int index = s.charAt(right) - 'A';
            arr[index]++;

            max = Math.max(max,arr[index]);
            if(max + k < right - left + 1){
                arr[s.charAt(left) - 'A']--;
                left++;

            }
        }

        return right - left;
    }
}
