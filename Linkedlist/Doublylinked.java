package Linkedlist;

public class Doublylinked {

    public Node head;

    public void atbeg(int x) {
        Node node = new Node(x);
        node.prev = null;
        node.next = head;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + "->");
            last = temp;
            temp = temp.next;
        }

    }

    public void atlast(int x) {
        Node node = new Node(x);
        Node temp = head;
        node.next = null;

        if (head == null) {

            node.prev = null;
            head = node;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public Node find(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == val)
                return temp;

            temp = temp.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node node = new Node(val);

        Node p = find(after);
        if (p == null) {
            System.out.println("Does not exist");
            return;
        }
        node.next = p.next;
        p.next = node;
        node.prev = p;

        if (node.next != null) {
            node.next.prev = node;
        }

    }

    public class Node {
        public Node prev;
        public int value;
        public Node next;

        public Node(int x) {
            this.value = x;
        }

        public Node(int x, Node next, Node prev) {
            this.value = x;
            this.prev = prev;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Doublylinked list = new Doublylinked();
        list.atlast(18);
        list.atlast(16);
        list.atlast(14);
        list.atlast(12);
        list.insert(14, 13);

        list.display();
    }

}
