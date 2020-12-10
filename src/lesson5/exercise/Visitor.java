package lesson5.exercise;


/**
 * Visitor is a common design pattern in software development. The visitor will be applied to every
 * node in a tree.
 */
public interface Visitor {

  void visit(BinaryTree.Node node);

}
