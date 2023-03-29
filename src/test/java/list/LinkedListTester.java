package list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import list.LinkedList;
public class LinkedListTester {

    @Test
    public void LoopDetection() {
        // Challenge: Given a circular linked list, implement an algorithm determines
        // whether the linked list has a circular loop
        //
        // Definition: A circular linked list (corrupt) is one where a node's next pointer
        // points to an earlier node.

        // Example
        // Input: 1 -> 2 -> 3 -> 4 -> 5 -> 3 (same as earlier)

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        LinkedList loopDetector = new LinkedList();

        loopDetector.addBack(node1);
        loopDetector.addBack(node2);
        loopDetector.addBack(node3);
        loopDetector.addBack(node4);
        loopDetector.addBack(node5);
        loopDetector.addBack(node3); // loop!


        Assert.assertTrue(loopDetector.hasLoop());
    }
}
