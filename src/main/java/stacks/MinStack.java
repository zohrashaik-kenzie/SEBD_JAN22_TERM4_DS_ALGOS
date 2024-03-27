package stacks;

// Soln:
//
// We could scan the Stack every time a new min is added. But that would violate
// our O(1) time constraint.
//
// A better way to do this would be to track the current min everytime a new item is added.
// Then when we pop them off, we can simply return what would be the current min at that time.
// This works because Stacks have in implied order. They never change. So we can do
// something like this:
//
// push(5) - stack: 5 min: 5
// push(6) - stack: 6, 5 min: 5
// push(3) - stack: 3, 6, 5 min: 3
// push(7) - stack: 7, 3, 6, 5 min: 3
// pop() - stack: 3, 6, 5 min: 3
// pop() - stack: 6, 5 min: 5
//
// See how our stack of 6, 5 goes back to it's min of 5?
// Hence if we track the min as as push items, we can return the appropriate min
// when our node comes to the top of stack (without having to rescan)

public class MinStack {

    private class Node {

        private int data;
        private int min; // track here
        private Node next;

        private Node (int data, int min) {
            this.data = data;
            this.min = min;
        }
    }

    private Node head;

    public void push(int data) {
        int min = data;

        // check for a min every time we add a node
        if (head != null) {
            min = Math.min(data, getMin());
        }

        Node newNode = new Node(data, min);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        int data = head.data;
        head = head.next;

        return data;
    }

    public int getMin() {
        return head.min;
    }

    public static void main(String[] args){
        MinStack s = new MinStack();

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
        s.pop();
        System.out.println("Current min 5 = " + s.getMin());

    }

}
