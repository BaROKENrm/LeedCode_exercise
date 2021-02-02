package day54;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
//leetcode 1202


public class day54exercise_2 {

    static int N;
    static int[] p;

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {

        N = s.length();
        p = new int[N];

        for(int i = 0;i < N;i++){
            p[i] = i;
        }



        for(List<Integer> pair : pairs){
            int a = pair.get(0);
            int b = pair.get(1);
            meger(a,b);
//            if (isSameFather(a,b)){
//                continue;
//            }
//            else{
//                meger(a,b);
//            }
        }

        // 第 2 步：构建映射关系
        char[] charArray = s.toCharArray();
        // key：连通分量的代表元，value：同一个连通分量的字符集合（保存在一个优先队列中）
        Map<Integer, PriorityQueue<Character>> hashMap = new HashMap<>(N);
        for (int i = 0; i < N; i++) {

            int root = find(i);
            if (hashMap.containsKey(root)) {
                hashMap.get(root).offer(charArray[i]);
            } else {
                PriorityQueue<Character> minHeap = new PriorityQueue<>();
                minHeap.offer(charArray[i]);
                hashMap.put(root, minHeap);
            }
        }

        // 第 3 步：重组字符串
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int root = find(i);
            stringBuilder.append(hashMap.get(root).poll());
        }
        return stringBuilder.toString();
    }



    private int find(int x) {
        if(p[x] != x){
            p[x] = find(p[x]);
        }
        return p[x];
    }

    // 让 a 节点的“祖宗”节点的 father 指针指向 b 节点的祖宗节点
    //合并两个集合
    public void meger(int a, int b) {
        p[find(a)] = find(b);
    }
    //判断两个节点是否是同一个“祖宗”节点
    public boolean isSameFather(int a,int b){
        return find(a) == find(b);
    }
}
