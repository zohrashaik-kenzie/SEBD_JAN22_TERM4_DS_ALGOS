package queues;

import java.util.*;

class PriorityQueueDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating empty priority queue
        Queue<String> pQueue = new PriorityQueue<>();

        // Adding items to the pQueue using add()
        pQueue.add("Kyle");
        pQueue.add("Egor");
        pQueue.add("Zohra");
        pQueue.add("Emily");
        pQueue.add("Jacobus");
        pQueue.add("Julia");

        System.out.println(pQueue.toString());
        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        pQueue.poll();

        // Printing the top element again
        System.out.println(pQueue.toString());
    }
}