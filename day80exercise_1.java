package day80;

import java.util.Iterator;
import java.util.LinkedList;

public class day80exercise_1 {
    private final int len =  769;
    private LinkedList[] list;
    /** Initialize your data structure here. */
    public day80exercise_1() {
        list = new LinkedList[len];
        for(int i = 0; i < len; i ++){
            list[i] = new LinkedList<Integer>();
        }
    }

    public void add(int key) {
        int index = hash(key);
        Iterator<Integer> iterator = list[index].iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            if(num == key){
                return;
            }
        }
        list[index].offerLast(key);
    }

    public void remove(int key) {
        int index = hash(key);
        Iterator<Integer> iterator = list[index].iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            if(num == key){
                list[index].remove(num);
                return;
            }
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index = hash(key);
        Iterator<Integer> iterator = list[index].iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            if(num == key){
                return true;
            }
        }
        return false;
    }

    private int hash(int key){
        return key & (len - 1);
    }
}
