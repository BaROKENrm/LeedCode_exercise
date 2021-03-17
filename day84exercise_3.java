package day84;

import java.util.Comparator;
import java.util.PriorityQueue;

public class day84exercise_3 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr.length == 0){
            return new int[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for(int num : arr){
            if(queue.size() < k || queue.isEmpty() || queue.peek() > num){
                queue.offer(num);
            }
            if(queue.size() > k){
                queue.poll();
            }
        }

        int[] ret = new int[queue.size()];
        int index = 0;
        for(int num : queue){
            ret[index++] = num;
        }
        return ret;
    }
}
