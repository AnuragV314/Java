package LinkedList;

class LL {
    Node head = null;

    class Node {
        int data;
        Node next;

        // constructor to initialize
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node insert(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        LL ll = new LL();
        ll.insert(12);
        ll.insert(13);
        ll.insert(14);
        ll.insert(15);
        ll.insert(16);

        ll.display();

    }

}
