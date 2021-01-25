package lesson8.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class SomeMoreExercises {

  @Test
  public void numberOfDuplicatesTest() {
    List<Integer> list = List.of(1, 2, 3, 4, 5, 9, 1, 4, 5, 6);
    assertEquals(3, numberOfDuplicates(list));
  }

  public static <T> int numberOfDuplicates(List<T> list) {
    // TODO: How could you use lists / sets to perform this goal?
    // Hint: size() is specified for lists and sets.
    return 0;
  }

  @Test
  public void countOccurrenceTest() {
    String s =
        "Java is a class-based, object-oriented programming language that is designed to have"
            + " as few implementation dependencies as possible. It is a general-purpose programming"
            + " language intended to let application developers write once, run anywhere (WORA),"
            + " meaning that compiled Java code can run on all platforms that support Java without"
            + " the need for recompilation. Java applications are typically compiled to bytecode"
            + " that can run on any Java virtual machine (JVM) regardless of the underlying computer"
            + " architecture. The syntax of Java is similar to C and C++, but has fewer low-level"
            + " facilities than either of them. The Java runtime provides dynamic capabilities"
            + " (such as reflection and runtime code modification) that are typically not available"
            + " in traditional compiled languages. As of 2019, Java was one of the most popular"
            + " programming languages in use according to GitHub, particularly for"
            + " client-server web applications, with a reported 9 million developers.";
    int count = countOccurrence(s, "Java");
    assertEquals(8, count);
  }

  public static int countOccurrence(String text, String searchedWord) {
    Map<String, Integer> map = new HashMap<>();
    // Remove all "."
    text = text.replaceAll("\\.", "");
    for (String word : text.split(" ")) {
      // For each word in the text:
      if (!map.containsKey("...")) { // TODO: replace "..."
        map.put(word, 1);
      } else {
        int prevCount = map.get(word);
        // TODO: Update count.
      }
    }
    // If searchedWord is not a key in this map use 0 as default.
    return map.getOrDefault(searchedWord, 0);
  }

}
