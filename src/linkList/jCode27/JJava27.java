package linkList.jCode27;

/**
 * 剑指 Offer II 027. 回文链表
 * 给定一个链表的 头节点 head ，请判断其是否为回文链表。
 *
 * 如果一个链表是回文，那么链表节点序列从前往后看和从后往前看是相同的。
 *
 * 解题思路： 可以将前一般进行倒转在与后一半进行对比
 *  需要注意的是：当是奇数个时，要注意去掉后半段的第一个，这是不用对比的
 */
/

public class JJava27 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }

        int index = 0;
        ListNode temp = head;
        while (temp != null){
            index++;
            temp = temp.next;
        }
        int temp2 = index / 2;
        ListNode pre ;
        temp = head.next;
        ListNode temp1 = temp;
        head.next = null;
        while (temp2 > 1 ){
            pre = temp;
            temp = temp.next;
            temp1 = pre.next;
            pre.next = head;
            head = pre;
            temp2--;
        }
        temp2 = index / 2;
        if (index % 2 != 0 && index != 1){
            temp1 = temp1.next;
        }
        while (temp2 > 0){
            if (head.val != temp1.val){
                return false;
            }else {
                head = head.next;
                temp1 = temp1.next;
            }
            temp2--;
        }
        return true;

    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode b = new ListNode(2);

        a.next = b;

        new JJava27().isPalindrome(a);
    }
}
