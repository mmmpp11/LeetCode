package java_exericse;

import javafx.util.Pair;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  138. 复制带随机指针的链表
 */

public class Exercise138 {
    public Node copyRandomList(Node head) {

        Node temp = new Node(-1);
        Node node = temp;
        HashMap<Integer, Node> map = new HashMap<>();
        HashMap<Node,Integer> map1 = new HashMap<>();
        HashMap<Node,Integer> map2 = new HashMap<>();
        Node temp2 = head;
        int i = 0;
        while (head != null){
            node.next = new Node(head.val);
            map1.put(head,i);
            map2.put(node.next,i);
            map.put(i,node.next);
            node = node.next;
            head = head.next;
            i++;
        }

        node = temp.next;

        int n;
        while (temp2 != null){
            if (temp2.random == null){
                n = i;
            }else {
                n = map1.get(temp2.random);
            }
            node.random = map.get(n);
            temp2 = temp2.next;
            node = node.next;
        }
        return temp.next;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
