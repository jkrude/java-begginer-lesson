package lesson9.exercise;


import static org.junit.jupiter.api.Assertions.assertEquals;

import lesson5.solution.Gnirts;
import org.junit.jupiter.api.Test;


/*
 * TODO Remember the Gnirts class from lesson5?
 *  Imagine your team mate wrote an implementation and you should test it before it can be used.
 *  Try to design your tests without knowing the exact implementation.
 *  Test all methods and constructors.
 *  create a @Before method Test the basic
 *  Use assertEquals or other Assertions methods to ensure the correctness.
 *  Think about edge cases: What should happen if?
 */
public class GnirtsTest {

  private Gnirts testObject;


  @Test
  public void lengthTest() {
    // TODO use the right expected value ( depending on your setup method ).
    assertEquals(0, testObject.length());
  }

}
