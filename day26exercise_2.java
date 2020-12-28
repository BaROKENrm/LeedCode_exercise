package day26;



class ListNode {
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class day26exercise_2 {
    public ListNode swapPairs(ListNode head) {
        ListNode curHead = new ListNode(0);
        curHead.next = head;
        ListNode pre = curHead;
        while (pre.next != null && pre.next.next != null) {
            ListNode cur = pre.next;
            ListNode temp = pre.next.next;
            pre.next = temp;
            cur.next = temp.next;
            temp.next = cur;
            pre = cur;
        }
        return curHead.next;
    }
}


