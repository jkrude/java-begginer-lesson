package lesson7.exercise;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

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
        return mulHelper(y, x, z);
    }

    public static int mulHelper(int a, int b, int z) {
        if (b == 0) {
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
        String result = "";
        for (int i = 0; i < x.length(); i++) {
            // Reverse x
            for (int j = x.length() - 1; j >= 0; ++j) {
                result += x.charAt(i);
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
        int xx = x.getX();
        assertEquals(2, xx);
        X xxx = x;
        callFoo(xxx);
        assertEquals(42, xxx.x);
    }

    public void callFoo(X x) {
        x.x = 42;
        x.foo();
    }

    private void callFoo(XX x) {
        x.x = 2;
        x.foo();
    }


    static class X {

        public int x;

        public X() {
            this.x = 0;
        }

        private void foo() {
            x += 1;
        }
    }

    static class XX extends X {

        public int x;

        public XX(int x) {
            this.x = x;
        }

        public void foo() {
            x += 2;
        }

        public int getX() {
            return super.x;
        }
    }

}
