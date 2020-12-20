package day21;
//编写一个程序，找到两个单链表相交的起始节点。

import java.util.HashSet;
import java.util.List;

class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
         val = x;
         next = null;
    }
 }

public class day21exercise_3 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> list = new HashSet<ListNode>();
        ListNode curA = headA;
        while(curA != null ){
            list.add(curA);
            curA = curA.next;
        }
        ListNode curB = headB;
        while(curB != null){
            if(list.contains(curB)){
                return curB;
            }
            else{
                list.add(curB);
                curB = curB.next;
            }
        }
        return null;
    }
}
