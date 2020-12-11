package day12;
//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class day12exercise_2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode curHead = new ListNode(0);
        ListNode newHead = curHead;
        while(cur1 != null && cur2 != null){
            if(cur1.val > cur2.val){
                curHead.next = cur2;
                curHead = cur2;
                cur2 = cur2.next;
            }
            else{
                curHead.next = cur1;
                curHead = cur1;
                cur1 = cur1.next;
            }
        }
        if(cur1 == null){
//            while(cur2 != null){
//                curHead.next = cur2;
//                cur2 = cur2.next;
//            }
            curHead.next = cur2;
        }
        if(cur2 == null){
//            while(cur1 != null){
//                curHead.next = cur1;
//                cur1 = cur1.next;
//            }
            curHead.next = cur1;
        }
        return newHead.next;
    }
}
