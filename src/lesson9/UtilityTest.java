package lesson9;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


/* As you can see your unit tests look just like a normal class.
 * Every test case should have its own test-method.
 * For convention methods end with Test.
 */
public class UtilityTest {

  private List<Integer> integerList;

  // This method is called before every test case.
  @Before
  public void setup() {
    integerList = List.of(1, 2, 3, 5, 3, 2, 1);
  }

  @Test
  public void containsOnlyEvenTest() {
    // Test your method and check the result for correctness.
    boolean onlyEven = Utility.containsOnlyEven(List.of(0, 2, 4, 6, 8));
    assertTrue(onlyEven); // if(onlyEven) -> success

    onlyEven = Utility.containsOnlyEven(List.of(0, 2, 4, 3));
    Assertions.assertFalse(onlyEven); // No magic but static methods within class Assertions.
  }


  @Test
  public void sumTest() {
    // Often times you want to compare the result with an expected value.
    int sum = Utility.sum(integerList);
    assertEquals(17, sum);
  }

  @Test
  public void numOfDuplicatesBaseTest() {
    int numOfDuplicates = Utility.numOfDuplicates(integerList);
    assertEquals(3, numOfDuplicates);
  }

  @Test
  public void sumExceptionTest() {
    // Test if your method throws an expected exception.
    // We will explain this cool lambda () -> ... in the next lesson!
    assertThrows(IllegalArgumentException.class, () -> Utility.sum(null));
  }

}