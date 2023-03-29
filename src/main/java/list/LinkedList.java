package list;
public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void addBack(Node newNode) {

        // if head... set and return
        if (head == null) {
            head = newNode;
            return;
        }

        // Else starting at head...
        Node current = head;

        // Walk until to hit tail
        while (current.next != null) {
            current = current.next;
        }

        // Set current node to equal newNode
        current.next = newNode;
    }

    public void createLL(int nodeValue) {
        Node newNode = new Node(nodeValue);
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode(int nodeValue) {
        if (head == null) {
            createLL(nodeValue);
            return;
        }

        Node newNode = new Node(nodeValue);
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traversalLL() {
        Node tempNode = head;
        for (int i =0; i<size; i++) {
            System.out.print(tempNode.value);
            if (i != size -1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

    public boolean hasLoop() {
        return hasLoop(head);
    }

    boolean hasLoop(Node first) {
        Node slow = first;
        Node fast = first;

        while(fast != null && fast.next != null) {
            slow = slow.next;          // 1 hop
            fast = fast.next.next;     // 2 hops

            if(slow == fast)  // fast caught up to slow, so there is a loop
                return true;
        }
        return false;  // fast reached null, so the list terminates
    }

}
