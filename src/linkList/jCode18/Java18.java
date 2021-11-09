package linkList.jCode18;

/**
 * 剑指 Offer 18. 删除链表的节点
 *
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 *
 * 注意：此题对比原题有改动
 *
 * 解题思路：可以创建一个新的指针指向head,然后开始遍历直至找到那个val
 */

public class Java18 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode node = new ListNode(-1);
        ListNode a = node;
        node.next = head;
        while (node.next != null){
            if (node.next.val == val){
                if (node.next.next == null){
                    node.next = null;
                }else {
                    node.next = node.next.next;
                }
                break;
            }
            node = node.next;
        }
        return a.next;
    }
}
