package day52;

import java.util.ArrayList;
import java.util.List;

//数组实现单链表
public class day53exercise_2 {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.init();
        myArrayList.addToHead(1);
        myArrayList.addToHead(2);
        myArrayList.addToHead(3);
        myArrayList.addToHead(4);
        myArrayList.addToHead(5);
        myArrayList.add(10,20);
        myArrayList.add(15,21);
        myArrayList.show();

    }
}


class MyArrayList{
    /**
     * e[] 链表中存储的值
     * ne[] 链表中下一个元素位置
     * index 当前可用位置
     * head  头
     */
    static final int N = 100;
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int index;
    static int head;
    /**
     *初始化链表
     */
    public void init(){
        head = -1;
        index = 0;
    }

    /**
     * 将值插入到头的后面
     * @param x 插入的值
     */
    public void addToHead(int x){
        e[index] = x;
        ne[index] = head;
        head = index;
        index++;
    }

    /**
     * 将值插入到指定位置后面
     * @param x 插入的值
     * @param k 插入的位置
     */
    public void add(int x,int k){
        e[index] = x;
        ne[index] = ne[k];
        ne[k] = index;
        index++;
    }

    /**
     * 删除指定位置后面的节点
     * @param k 指定位置
     */
    public void remove(int k){
        ne[k] = ne[ne[k]];
    }

    public void show(){
        for (int i = 0; i < N; i++) {
            System.out.println(e[i]);
        }
    }
}
