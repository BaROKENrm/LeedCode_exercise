package day98;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
//剑指 Offer 59 - I. 滑动窗口的最大值
public class day98exercise_2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int len = nums.length;
        if(len == 0){
            return new int[0];
        }
        int[] ret = new int[len - k + 1];
        for(int i = 0; i < k; i ++){
            while(!deque.isEmpty() && deque.peekLast() < nums[i]){
                deque.pollLast();
            }
            deque.offerLast(nums[i]);
        }
        ret[0] = deque.peekFirst();
        for(int i = k;i < len; i ++){
            if(deque.peekFirst() == nums[i - k]){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && deque.peekLast() < nums[i]){
                deque.pollLast();
            }
            deque.offerLast(nums[i]);
            ret[i - k + 1] = deque.peekFirst();
        }
        return ret;
    }
}
