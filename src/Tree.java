import java.util.List;

public class Tree<T>{

   private Node<T> root;

   public Tree(T data) {
      root = new Node<T>();
      root.setData(data);
      root.setLeftLeaf(new Node<T>());
      root.setRightLeaf(new Node<T>());
   }

}

class Node<T>{
   private T data;
   private Node<T> parent;
   private Node<T> leftLeaf;
   private Node<T> rightLeaf;

   public T getData() {
      return data;
   }

   public void setData(T data) {
      this.data = data;
   }

   public Node<T> getParent() {
      return parent;
   }

   public void setParent(Node<T> parent) {
      this.parent = parent;
   }

   public Node<T> getLeftLeaf() {
      return leftLeaf;
   }

   public void setLeftLeaf(Node<T> leftLeaf) {
      this.leftLeaf = leftLeaf;
   }

   public Node<T> getRightLeaf() {
      return rightLeaf;
   }

   public void setRightLeaf(Node<T> rightLeaf) {
      this.rightLeaf = rightLeaf;
   }
}
