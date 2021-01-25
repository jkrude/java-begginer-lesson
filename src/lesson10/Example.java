package lesson10;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import lesson3and4.Person;

@SuppressWarnings("ALL")
public class Example {

  public static void main(String[] args) {


    /*
     * Lambdas are anonymous functions. They are a core principe for functional-programing-languages.
     * Although java is mainly object-oriented there are other paradigms supported.
     * NOTE: The main idea is passing functionality.
     */

    // Image you want to iterate through a map and print the key,value pairs in a certain way.
    Map<String, Integer> map = Map.of("A", 2, "B", 2, "C", 3);

    for (Entry<String, Integer> pair : map.entrySet()) {
      String key = pair.getKey();
      Integer value = pair.getValue();
      System.out.println(key + "::" + value);
    }
    /* You could express this with the use of lambdas in a more elegant way.
     * (key, value) are the method-parameter, you could write (String key, Integer value) too.
     * -> is like a keyword for lambdas, after witch the method body follows.
     * Our lambda is syntactically the same to printMap.
     */
    map.forEach((key, value) -> System.out.println(key + "::" + value));

    // NOTE: Dont be confused by method-chaining
    // A method returns an object -> we directly call a method from this method -> returns an object...
    int length = new String(" String ").replaceAll("S", "").strip().length();

    // Is the same as:
    String s = new String(" String ");
    s = s.replace("S", "");
    s = s.strip();
    length = s.length();

    /* Now imagine you have a list of people (class Person from lesson3) and you want to
     * calculate the total age for people whose name begins with a 'c'.
     * To achieve this, we would have to:
     *  - filter the list
     *  - extract the age,
     *  - add all together,
     */
    List<Person> personList = List.of(
        new Person("Charlyn", 37),
        new Person(" Leeanna, ", 59),
        new Person("Isaac", 40),
        new Person("Claudine", 12),
        new Person("Coleen", 3));

    // We can achieve this using javas stream API:

    int totalAge = personList.stream() // Create a stream.
        .filter(person -> person.getName().startsWith("c")) // Filter with a predicate.
        .map(person -> person.getAge()) // From a stream of people to a stream of integer.
        .reduce(0, (x, y) -> x + y); // Add everything together.
  }


  /*
   * Helper methods.
   */
  private static void printMap(String key, Integer value) {
    System.out.println(key + "::" + value);
  }

}



