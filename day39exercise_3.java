package day39;

//leetcode 19
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class day39exercise_3 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = new ListNode(0);
        cur.next = head;
        ListNode fast = cur;
        ListNode slow = cur;
        int count = 0;
        while(count != n){
            fast = fast.next;
            count++;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return cur.next;
    }
}
