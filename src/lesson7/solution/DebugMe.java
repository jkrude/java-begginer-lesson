package lesson7.solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DebugMe {


  @Test
  public void multiplyTest() {
    int z = multiply(2, 3);
    assertEquals(6, z);
    z = multiply(2, 0);
    assertEquals(z, 0);

  }

  // x * y = z
  public static int multiply(int x, int y) {
    int z = y == 0 ? 0
        : x; // This is called a ternary operator checkout different combinations with the expression calculator.
    y -= 1;
    return mulHelper(x, y, z); // y and x were switched (however 3 * 2 = 2 * 3)
  }

  public static int mulHelper(int a, int b, int z) {
    // Your base case should be especially closely checked.
    if (b <= 0) { // z might be negative and the recursion would never end.
      return z;
    }
    z += a;
    b -= 1;
    return mulHelper(a, b, z);
  }

  @Test
  public void reverseMultiplyByLengthTest() {
    assertEquals("ZYXZYXZYX", reverseMultiplyByLength("XYZ"));
  }


  // Reverse x and concatenate it x.length() times.
  public static String reverseMultiplyByLength(String x) {
    String result = ""; // NOTE: A StringBuilder would be the better choice!
    for (int i = 0; i < x.length(); i++) {
      // Reverse x
      for (int j = x.length() - 1; j >= 0; --j) { // j has to be decremented!
        result += x.charAt(j); // Watch out for nested loops and witch variable is used where!
      }
    }
    return result;
  }

  // The total chaos of X-Mas.
  @Test
  public void testClass() {
    // Try to understand the control-flow and where what x is changed.
    // How could this mess be avoided?
    XX x = new XX(4);
    callFoo(x);
    int y = x.getX();
    assertEquals(2, y);
    X z = x;
    callFoo(z);
    assertEquals(42, z.x); // In the original version expected was 43 witch makes no sense.
  }

  public void callFoo(X x) {
    // x.x will access x from the class X even if x might be of class XX.
    // What counts is the declared type (X) and not the possible actual in memory type.
    x.x = 42;
    /* x.foo will call XX::foo because the most specialised method will be used!
     * Even if x is only declared as of type X! Because XX has overridden foo.
     * Set a breakpoint here and step into the method.
     * Have a look at this.x and super.x with the expression-evaluation tool!
     */
    x.foo();
  }

  private void callFoo(XX x) {
    x.setX(0); // Use setter to guide the access.
    x.foo();
  }


  static class X {

    protected int x;

    public X() {
      this.x = 0;
    }

    public void foo() {
      // Remember this method modifies X::x of this specific object (the method is called on).
      // Therefore the changes are stored in this specific object and foo can return void, but still have an impact.
      x += 1;
    }
  }

  static class XX extends X {

    /* Avoid duplicate names at all cost.
     * In this case an object of class XX has to variables named x! this.x and super.x!
     * Be aware that this is well defined and wont throw an error.
     * X::x is not overridden but exists as super.x!
     * If you use getter and setter make your variable private.
     * Otherwise the use of your class is not clear at all.
     */
    private int x;

    public XX(int x) {
      this.x = x;
    }

    // Use @Override to make sure that the method actually overwrites another one.
    @Override
    public void foo() { // X::foo was private therefore XX::foo did not override it.
      x += 2;
    }

    public int getX() {
      return this.x; // Return XX::x and not X:x!
    }

    public void setX(int newX) {
      this.x = newX;
    }

  }

}
