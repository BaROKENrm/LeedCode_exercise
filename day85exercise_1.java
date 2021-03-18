package day85;

import java.util.*;

public class day85exercise_1 {

}
//剑指 Offer 41. 数据流中的中位数
class MedianFinder {
    PriorityQueue<Integer> small;
    PriorityQueue<Integer> big;
    /** initialize your data structure here. */
    public MedianFinder() {
        small = new PriorityQueue<>(); // 小堆
        big = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });   //大堆
    }

    public void addNum(int num) {
        if(small.size() != big.size()){
            small.add(num);
            big.add(small.poll());
        }
        else{
            big.add(num);
            small.add(big.poll());
        }
    }

    public double findMedian() {
        return small.size() == big.size() ? (small.peek() + big.peek()) / 2.0 : big.peek() / 1.0;
    }
}