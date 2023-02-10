package list;

public class Partition {

    static LinkedList partition(LinkedList ll, int x) {
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = ll.head;
                ll.head = currentNode;
            } else {
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        ll.traversalLL();
        return ll;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(50);
        // System.out.println(sLL.head.value);
        ll.insertNode(20);
        ll.insertNode(90);
        ll.insertNode(20);
        ll.insertNode(30);
        ll.insertNode(80);
        ll.traversalLL();

        LinkedList l2 = partition(ll,30);
        l2.traversalLL();
    }
}
