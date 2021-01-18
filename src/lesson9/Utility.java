package lesson9;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public final class Utility {

  private Utility() {
  }

  public static boolean containsOnlyEven(List<Integer> list) {
    for (int i : list) {
      if (i % 2 == 1) {
        return false;
      }
    }
    return true;
  }

  public static int sum(Collection<Integer> collection) {
    // This is for pure demonstration.
    // Throwing an IllegalArgumentException instead of an NullPointerException is questionable.
    if (collection == null) {
      throw new IllegalArgumentException("Argument should not be null");
    }
    Iterator<Integer> iterator = collection.iterator();
    int sum = 0;
    while (iterator.hasNext()) {
      sum += iterator.next();
    }
    return sum;
  }

  public static <T> int numOfDuplicates(List<T> list) {
    return list.size() - new HashSet<>(list).size();
  }

}