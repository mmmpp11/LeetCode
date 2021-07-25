package java_exericse;


/**
 * 剑指 Offer 52. 两个链表的第一个公共节点
 */

public class Exercise160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;
        while (a != b){
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        System.out.println(a);
        System.out.println(b);
        return a;
    }

    class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
