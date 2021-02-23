package day67;
//1052. 爱生气的书店老板
public class day67exercise_1 {
    public int maxSatisfied(int[] cs, int[] grumpy, int x) {
        int n = cs.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                ans += cs[i];
                cs[i] = 0;
            }
        }
        int max = 0, cur = 0;
        for (int i = 0, j = 0; i < n; i++) {
            cur += cs[i];
            if (i - j + 1 > x) cur -= cs[j++];
            max = Math.max(max, cur);
        }
        return ans + max;
    }
}
