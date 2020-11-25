package day01;
//删除链表中等于给定值 val 的所有节点。
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class exercise_3 {
        public ListNode removeElements(ListNode head, int val) {
            ListNode newHead = new ListNode(0);
            newHead.next = head;
            ListNode cur = head;
            ListNode prev = newHead;
            while (cur != null) {
                if (cur.val == val) {
                    prev.next = cur.next;
                } else {
                    prev = cur;
                }
                cur = cur.next;
            }
            return newHead.next;
        }
}
