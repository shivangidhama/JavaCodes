package Linkedlist;

public class circularlinked {
   public Node head;
   public Node tail;

   circularlinked(){
    this.head=null;
    this.tail=null;
   }
    class Node {
        int value;
        Node next;


        Node(int x) {
            this.value = x;
        }

        Node(int x, Node next) {
            this.value=x;
            this.next=next;
        }
    }
    public void insert(int x){
        Node node= new Node(x);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;   
    }
    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.value + " -> ");
                if (node.next != null) {
		    node = node.next;
		}
            } while (node != head);
        }
        System.out.println("HEAD");
    }
    public static void main(String[] args) {
        circularlinked list=new circularlinked();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.display();
    }
}
