package Linkedlist;

public class singlylinkedlist {
    private Node head;
    private Node tail;
    private int size;

    singlylinkedlist() {
        this.size = 0;
    }

    public void InsertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void InsertLast(int val) {
        if (tail == null) {
            InsertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insertpos(int x, int index) {
        if (index == 0) {
            InsertFirst(x);
            return;
        }
        if (index == size) {
            InsertLast(x);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(x, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prevNode = get(index - 1);
        int val = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        size--;
        return val;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void duplicate_remov(){
Node temp=head;
  while(temp.next!=null){
    if(temp.value==temp.next.value){
        temp.next=temp.next.next;
        size--;
    }
    else
      temp=temp.next;
  }
 tail=temp;
temp.next=null;
    }
    public static singlylinkedlist merge(singlylinkedlist l1,singlylinkedlist l2){
        Node f=l1.head;
        Node s=l2.head;
        singlylinkedlist ans=new singlylinkedlist();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.InsertLast(f.value);
                f=f.next;
            }
            else{
                ans.InsertLast(s.value);
                s=s.next;
            }
        }
        while (f!=null) {
            ans.InsertLast(f.value);
            f=f.next;
        }
        while (s!=null) {
            ans.InsertLast(s.value);
            s=s.next;
        }
        return ans;
    }
    public class Node {
        private int value;
        private Node next;

        public Node(int x) {
            this.value = x;
        }

        public Node(int x, Node next) {
            this.value = x;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        singlylinkedlist list = new singlylinkedlist();
        singlylinkedlist list2 =new singlylinkedlist();
        list.InsertLast(1);
        list.InsertLast(2);
        list.InsertLast(3);
        list.InsertLast(5);
        list.InsertLast(8);

        list2.InsertLast(4);
        list2.InsertLast(6);
        list2.InsertLast(7);
        list2.InsertLast(9);
        list2.InsertLast(10);
        list.display();
        list2.display();
        singlylinkedlist result= singlylinkedlist.merge(list, list2);
        result.display();

    }
}
