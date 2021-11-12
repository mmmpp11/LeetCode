package linkList.jCode25;
/**
 * 剑指 Offer 25. 合并两个排序的链表
 *
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 */

public class JJava25 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        ListNode pre = new ListNode(-1);
        ListNode temp = pre;
        while (l1 != null || l2 != null){
            if (l1 == null){
                pre.next = l2;
                l2 = l2.next;
                pre = pre.next;
                continue;
            }else if (l2 == null){
                pre.next = l1;
                l1 = l1.next;
                pre = pre.next;
                continue;
            }
            if (l1.val > l2.val){
                pre.next = l2;
                l2 = l2.next;
            }else {
                pre.next = l1;
                l1 = l1.next;
            }
            pre = pre.next;
        }
        return temp.next;
    }
}
