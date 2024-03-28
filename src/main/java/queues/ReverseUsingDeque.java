package queues;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class ReverseUsingDeque {
    public static void main(String args[])
    {
        // Creating an empty Deque
        Deque<Integer> deque = new LinkedList<>();

        // Use add() method to add elements into the Queue
        deque.add(10);
        deque.add(15);
        deque.add(30);
        deque.add(20);
        deque.add(5);

        // Call iterator() method of deque
        Iterator iteratorVals = deque.iterator();

        // Print elements of iterator
        // created from PriorityBlockingQueue
        System.out.println("The iterator values"
                + " of deque are:");

        // prints the elements using an iterator
        while (iteratorVals.hasNext()) {
            System.out.println(iteratorVals.next());
        }


        iteratorVals = deque.descendingIterator();

        // Print elements of iterator
        // created from PriorityBlockingQueue
        System.out.println("The descending iterator values"
                + " of deque are:");

        // prints the elements using an iterator
        while (iteratorVals.hasNext()) {
            System.out.println(iteratorVals.next());
        }
    }
}
