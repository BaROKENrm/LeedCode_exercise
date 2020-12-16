package day17;

//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class day17exercise {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode cur = head;
        while(cur.next != null && cur != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }
            else{
                cur.next = cur;
            }
        }
        return head;
    }
}
