package stack.code155;

import java.util.*;

/**
 * 155. 最小栈
 *
 * 解题思路 ： 一个栈放值，一个栈放最小值
 */
public class Java155 {
}

class MinStack {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();


    private int index = 0;

    public MinStack() {
    }

    public void push(int val) {
        stack1.push(val);
        if (stack2.empty() || val <= getMin()){
            stack2.push(val);
        }else {
            stack2.push(getMin());
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }
}
