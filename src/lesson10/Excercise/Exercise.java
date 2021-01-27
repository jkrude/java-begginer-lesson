package lesson10.Excercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import lesson3and4.Person;
import lesson5.exercise.BinaryTree.Node;
import org.junit.jupiter.api.Test;


public class Exercise {

  /*
   * Sort the list by writing your own comparator.
   * (Comparator is a functional interface)
   * A comparator gets to objects and returns which one is greater.
   * Use compareTo from the class String in order to compare to strings.
   *  int diff = new String("AA").compareTo("BB");
   */
  public List<Person> copySortList(List<Person> personList) {
    List<Person> copy = new ArrayList<>(personList);
    // TODO replace ... with you lambda expression
    //copy.sort(...);
    return copy;
  }


  @Test
  void copySortedListTest() {
    List<Person> personList = List.of(
        new Person("A", 37),
        new Person("C", 59),
        new Person("E", 40),
        new Person("D", 12),
        new Person("B", 3));
    List<Person> sorted = copySortList(personList);
    assertEquals(5, sorted.size());
    assertEquals("A", sorted.get(0).getName());
    assertEquals("B", sorted.get(1).getName());
    assertEquals("C", sorted.get(2).getName());
    assertEquals("D", sorted.get(3).getName());
    assertEquals("E", sorted.get(4).getName());
  }


  /* Filter out everyone above 18.
   * Extract the names.
   * Utilize the stream API and lambdas to achieve this.
   * Convert a stream back to a list with .collect(Collectors.toList());
   */
  public List<String> getMinorNames(List<Person> personList) {
    //TODO
    // personList.stream() ... convert to list to a stream
    // .collect(Collectors.toList()); to convert the stream to a list
    return null;
  }

  @Test
  public void getSortedMinorsTest() {
    List<Person> personList = List.of(
        new Person("Charlyn", 37),
        new Person(" Leeanna, ", 59),
        new Person("Isaac", 40),
        new Person("Claudine", 12),
        new Person("Coleen", 3));

    List<String> result = getMinorNames(personList);
    assertEquals(2, result.size());
    assertTrue(result.contains("Claudine"));
    assertTrue(result.contains("Coleen"));
  }

  /*
   * If you want an additional challenge have a look into lesson5/exercise.
   * Visitor is a perfect candidate to be replaced as a lambda.
   */
  public void printTree() {
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

    // TODO print each node using a lambda.
    //root.applyVisitor(...);
  }


}
