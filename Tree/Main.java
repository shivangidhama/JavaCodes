package Tree;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    BinaryTree obj=new BinaryTree();
    Scanner sc=new Scanner(System.in);
    obj.insert(sc);
    obj.InOrder();
  }  
}
