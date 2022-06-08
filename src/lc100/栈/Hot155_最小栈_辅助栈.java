package lc100.栈;

/**
 * https://leetcode-cn.com/problems/min-stack/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-10 0:12
 */
public class Hot155_最小栈_辅助栈 {
    //对于-128到127的Integer，==是同一个对象。
    //对于常数时间内完成的理解
}

/*
class MinStack {
    Stack<Integer> dataStack;
    Stack<Integer> minStack;   //辅助栈

    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        dataStack.push(val);
    }

    public void pop() {
        if(minStack.peek().equals(dataStack.peek())){  //对于-128到127的Integer，==是同一个对象。
            minStack.pop();
        }
        dataStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

*/
