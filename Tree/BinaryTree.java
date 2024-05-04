package Tree;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree() {

    }

    private static class Node {
        Node left;
        int value;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(Scanner sc) {
        System.out.println("Enter the value");
        int value = sc.nextInt();
        root = new Node(value);
        insert(sc, root);
    }

    public void insert(Scanner sc, Node node) {
        System.out.println("Do you want to enter left");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of"+" "+ node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            insert(sc, node.left);
        }
        System.out.println("Do you want to enter right of"+" " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of"+" " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            insert(sc, node.right);
        }
    }

    public void preOrder() {
        preOrder();
    }

    public void preorder(Node node) {
        if (node == null) {
            return;
        }
        preorder(node.left);
        System.out.print(node.value + " ");
        preorder(node.right);
    }
    public void InOrder() {
        InOrder(root);
    }

    public void InOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
public void PostOrder(){
    PostOrder(root);
}
public void PostOrder(Node node){
    if(node==null){
        return;
    }
    InOrder(node.left);
    InOrder(node.right);
    System.out.print(node.value+" ");
}
}
