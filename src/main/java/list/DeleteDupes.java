package list;

import java.util.HashSet;

public class DeleteDupes {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(50);
        // System.out.println(sLL.head.value);
        ll.insertNode(20);
        ll.insertNode(90);
        ll.insertNode(20);
        ll.insertNode(30);
        ll.insertNode(80);
        ll.insertNode(20);
        ll.insertNode(80);
        ll.traversalLL();

        HashSet<Integer> hs = new HashSet();
        Node current = ll.head;
        Node prev = null;
        while (current != null) {
            int curval = current.value;
            if (hs.contains(curval)) {
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }

        ll.traversalLL();
    }
}

