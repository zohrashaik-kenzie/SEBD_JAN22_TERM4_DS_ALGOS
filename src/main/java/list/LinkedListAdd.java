package list;

public class LinkedListAdd {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep){
        while (node != null) {
            System.out.print(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    SinglyLinkedListNode n = new SinglyLinkedListNode(data);

    if (head == null) {
        head = n;
        return head;
    } else if (position == 0) {
        n.next = head;
        head = n;
        return head;
    } else {
        SinglyLinkedListNode c = head;
        while ((position - 1) > 0) {
            if (c.next != null) {
                c = c.next;
                position--;
            } else {
                break;
            }
        }

        n.next = c.next;
        c.next = n;

        return head;
    }
}

    public static SinglyLinkedListNode insertNodeAtPositionRecurse(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        if(position == 0)
        {
            SinglyLinkedListNode temp = llist;
            llist = new SinglyLinkedListNode(data);
            llist.next = temp;
        }
        else
            llist.next = insertNodeAtPositionRecurse(llist.next, data, position - 1);
        return llist;
    }

    public static void main(String[] args){
        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertNode(1);
        llist.insertNode(2);
        llist.insertNode(3);

        insertNodeAtPosition(llist.head,4,2);
        printSinglyLinkedList(llist.head, "->");
        System.out.println();

        insertNodeAtPositionRecurse(llist.head,4,2);
        printSinglyLinkedList(llist.head, "->");

    }
}
