package lesson9.solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import lesson5.solution.Gnirts;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class GnirtsTest {

  private static Gnirts testObject;


  @BeforeAll
  public static void setUp() throws Exception {
    // Same test condition for all tests.
    // Reduced boilerplate code within test-methods.
    testObject = new Gnirts("gnirtS");
  }

  @Test
  public void lengthTest() {
    assertEquals(6, testObject.length());

  }

  @Test
  public void charAtTest() {
    String expectedString = "String";
    for (int i = 0; i < expectedString.length(); ++i) {
      // Tests the base functionality too.
      assertEquals(expectedString.charAt(i), testObject.charAt(i));
    }
  }


  @Test
  public void subSequenceTest() {
    // 0=inclusive, 3=exclusive (see CharSequence)
    CharSequence expected = "Str";
    assertEquals(expected, testObject.subSequence(0, 3));

    // Possible edge-case.
    assertEquals("", testObject.subSequence(0, 0));
  }

  @Test
  public void subSequenceThrowTest() {
    assertThrows(Exception.class, () -> testObject.subSequence(-4, 0)); // IndexOutOfBounds
  }

}
