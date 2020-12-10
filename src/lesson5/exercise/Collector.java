package lesson5.exercise;

import java.util.ArrayList;
import java.util.List;
import lesson5.exercise.BinaryTree.Node;

/* Collector implements the visitor pattern.
 * A collector traverses a tree and collects every node in a list.
 */
public class Collector implements Visitor {

  // Lists will be explained in a later lecture.
  // Imagine them as an Array that resizes itself if more space is needed.
  private List<Node> dynamicArray;

  public Collector() {
    // List is an interface, ArrayList is an implementation of List.
    this.dynamicArray = new ArrayList<>();
  }

  @Override
  public void visit(Node node) {
    dynamicArray.add(node);
  }

  public Node[] asArray() {
    return dynamicArray.toArray(new Node[0]); // This returns the list as an array.
  }
}
