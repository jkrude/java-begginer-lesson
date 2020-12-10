package lesson5.exercise;

import lesson5.exercise.BinaryTree.Node;

public class Test {

  public static void main(String[] args) {

    /*
     *       root
     *    l1     r1
     *  l2     r2  r3
     * l3
     */
    Node root = new Node(0);
    Node l1 = new Node(1);
    Node r1 = new Node(2);
    Node l2 = new Node(3);
    Node l3 = new Node(4);
    Node r2 = new Node(5);
    Node r3 = new Node(6);
    root.addLeft(l1);
    root.addRight(r1);
    l1.addLeft(l2);
    l2.addLeft(l3);
    r1.addLeft(r2);
    r1.addRight(r3);

    BinaryTree tree = new BinaryTree(root);
    Node[] treeAsArray = tree.collapse();
    /*
    TreeSum sumVisitor; // new TreeSum() → needs to be implemented
    tree.applyVisitor(sumVisitor);
    if(sumVisitor.sumOfTree() == 21){
      System.out.println("Correct.");
    }else{
      System.out.println("Wrong answer.");
    }

     */

  }

}
