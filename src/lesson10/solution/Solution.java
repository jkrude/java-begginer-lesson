package lesson10.solution;

import lesson3and4.Person;
import lesson5.exercise.BinaryTree.Node;
import lesson5.exercise.Visitor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SuppressWarnings("ComparatorCombinators")
public class Solution {

    /*
     * Sort the list by writing your own comparator.
     * (Comparator is a functional interface)
     * A comparator gets to objects and returns which one is greater.
     * Use compareTo from the class String in order to compare to strings.
     *  int diff = new String("AA").compareTo("BB");
     */
    public List<Person> copySortList(List<Person> personList) {
        List<Person> copy = new ArrayList<>(personList);
        copy.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
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
        //NOTE: If you modify a collection with a stream, you have to capture the new list returned by collect().
        //Your initial collection will not be modified.
        return personList.stream()
                .filter(person -> person.getAge() < 18) // Your predicate will be tested on every person, if it returns false the element gets removed.
                .map(person -> person.getName()) // Transform from a Stream of "People" to a Stream of "String"
                .collect(Collectors.toList()); // This is the final method we call. Therefore its return value will be used.

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
    @Test
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
        // Have a look into lesson5.exercise.Visitor. The interface has only one method -> can be replaced by lambda
        root.applyVisitor((node) -> System.out.println(node.getValue()));
        // Your lambda describes an (on the fly) implementation for the interface.
        // Equally to:
        System.out.println("Equal solution without lambda:");
        root.applyVisitor(new Visitor() {
            @Override
            public void visit(Node node) {
                System.out.println(node.getValue());
            }
        });
    }


}
