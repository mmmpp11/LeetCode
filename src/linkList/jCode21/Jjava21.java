package linkList.jCode21;


/**
 * 剑指 Offer II 021. 删除链表的倒数第 n 个结点
 * 给定一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 解题思路：通过遍历确定链表个数，再找到要删除点的前一个和后一个删除即可
 *
 */

public class Jjava21 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(-1);
        ListNode temp = pre;
        temp.next = head;
        int index = 0;
        while (temp.next != null){
            index++;
            temp = temp.next;
        }
        temp = pre;
        int j = index - n;
        while (j > 0){
            temp = temp.next;
            j--;
        }
        if (temp.next.next == null){
            temp.next = null;
        }else {
            temp.next = temp.next.next;
        }
        return pre.next;
    }
}
