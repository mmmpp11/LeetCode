package linkList.JCode24;


/**
 * 剑指 Offer II 024. 反转链表
 *
 * 给定单链表的头节点 head ，请反转链表，并返回反转后的链表的头节点。
 *
 * 解题思路：头插法：将节点一个一个的插到前面
 */
public class JJava24 {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode temp = head.next;
        head.next = null;
        ListNode pre;
        while (temp != null){
            pre = temp;
            temp = temp.next;
            pre.next = head;
            head = pre;
        }
        return head;
    }
}
