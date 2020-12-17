package lesson5.exercise;

/*
 * Binary trees are wonderful. You can read more about them here: https://en.wikipedia.org/wiki/Binary_tree
 * A tree has one root. Every Node in the tree can have two (binary) children.
 */

public class BinaryTree {


  private Node root;

  public BinaryTree(Node root) {
    this.root = root;
  }

  public Node[] collapse() {
    // Returns the tree as a list with the order {leftChild | middle | rightChild]
    Collector visitor = new Collector(); // Collector implements the interface Visitor.
    root.applyVisitor(visitor);
    return visitor.asArray();
  }

  public void applyVisitor(Visitor visitor) {
    this.root.applyVisitor(visitor);
  }


  // Yes classes can have classes → this is called nested class.
  public static class Node {

    // Each node in a tree has a value and possible left and right children.
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
      this.value = value;
    }

    public void addRight(Node right) {
      this.right = right;
    }

    public void addLeft(Node left) {
      this.left = left;
    }

    // A node is considered a leaf if it has no children.
    public boolean isLeaf() {
      return left == null && right == null;
    }

    public void applyVisitor(Visitor visitor) {
      // The visitor visits always left than the middle and than the right.

      if (left != null) {
        left.applyVisitor(visitor);
      }
      visitor.visit(this); // this as a reference for the current Node the method was called on.
      if (right != null) {
        right.applyVisitor(visitor);
      }
    }

    public int getValue() {
      return value;
    }
  }

}
