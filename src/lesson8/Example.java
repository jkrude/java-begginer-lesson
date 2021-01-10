package lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Example {

  public static void main(String[] args) {

    String s1 = "Random Text1";
    String s2 = "Random Text2";

    /*
     * Generics
     */
    // We use the pair class by specifying which types we use for X and Y with the diamond operator <>.
    Pair<String, String> stringPair = new Pair<>(s1, s2);
    // Because we have used different types (X and Y) in the pair class
    //  we can also use different types here (integers and strings).
    Pair<Integer, String> mixedPair = new Pair<>(1, s1);
    // mixedPair = stringPair; would result in an error, because they pair is specified in different ways.
    // NOTE: Use the wrapper classes for primitive types (Integer for int, Double for double etc.).

    /*
     * Collections
     * NOTE: There are multiple implementation for each type (LinkedList, TreeSet, TreeMap, etc.)
     * Usually it is not important what type of implementation is used.
     * Therefore, one usually uses only the interface as a type.
     */
    // Lists like arrays but with dynamic size.
    // [0, 1, 2, 3, 4, 5, 6]
    System.out.println("Using lists");
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    System.out.println(list);
    list.remove(2); // list.remove(0);
    // You can iterate over a list just as you can over arrays.
    for (Integer i : list) {
      System.out.println(i);
    }

    // Sets = Lists in math: Every element exists only once + there is no order
    // [0, 5, 4, 6, 2, 3, 1]
    System.out.println("Using sets");
    HashSet<String> set = new HashSet<>();
    set.add(s1);
    set.add(s2);
    System.out.println(set);
    set.add(s1); // s1 will not be added because it is already present
    System.out.println(set);
    set.remove(s1); // there is no remove(0), because a set has no fixed order
    // Use an iterator or for each loop to iterate over a set.
    // If you need to iterate over an index you probably should have gone for a list.
    for (String s : set) {
      System.out.println(s);
    }

    System.out.println("Using maps");
    // Maps = pairs of key : value, keys are unique, values can be arbitrary.
    // { 1 : 2, 5 : 6, 4 : 3]
    Map<String, String> map = new HashMap<>();
    map.put(s1, s2);
    map.put(s2, s1);
    System.out.println(map);
    map.put(s1, s1); // Keys are unique therefore this overrides s1: s2
    System.out.println(map);
    map.remove(s1);
    /* There are a lot of different ways you could iterate over a map.
     * The most common one is a range based for loop over a set of all entries.
     * You will have to extract key and value out of the entry.
     * A more elegant version will be discussed in the lesson about lambdas.
     */
    for (Entry<String, String> entry : map.entrySet()) {
      String key = entry.getKey();
      String value = entry.getValue();
      System.out.println(key + " : " + value);
    }
  }
}
