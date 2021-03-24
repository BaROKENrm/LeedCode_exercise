package day92;

import java.util.ArrayDeque;
import java.util.Deque;
//456. 132 模式
public class day92exercise_3 {
    public boolean find132pattern(int[] nums) {
        int len = nums.length;
        if(len < 3){
            return false;
        }
        Deque<Integer> deque = new ArrayDeque<>();
        int min = Integer.MIN_VALUE;
        for(int i = len - 1; i >= 0; i --){
            if(nums[i] < min){
                return true;
            }
            while(!deque.isEmpty() && deque.peekLast() < nums[i]){
                int k = deque.pollLast();
                min = Math.max(min,k);
            }
            deque.offerLast(nums[i]);
        }
        return false;
    }
}
