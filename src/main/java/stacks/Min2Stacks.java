package stacks;

import java.util.Stack;

public class Min2Stacks {
    // stack: store the stack numbers
    private Stack<Integer> stack = new Stack<Integer>();
    // minStack: store the current min values
    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int x) {
        // store current min value into minStack
        if (minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
        stack.push(x);
    }

    public void pop() {
        // use equals to compare the value of two object, if equal, pop both of them
        if (stack.peek().equals(minStack.peek()))
            minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args){
        Min2Stacks s = new Min2Stacks();

        // Function calls
        s.push(5);
        System.out.println("Current min 1 = " + s.getMin());
        s.push(3);
        s.push(7);
        s.push(3);
        s.push(8);
        System.out.println("Current min 2 = " + s.getMin());
        s.pop();
        s.getMin();
        System.out.println("Current min 3 = " + s.getMin());
        s.pop();
        s.pop();
        System.out.println("Current min 4 = " + s.getMin());
        s.top();
        s.pop();
        System.out.println("Current min 5 = " + s.getMin());

    }
}
