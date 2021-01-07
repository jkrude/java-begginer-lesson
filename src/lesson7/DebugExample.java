package lesson7;


public class DebugExample {


    public static void main(String[] args) {
        // Set a breakpoint by clicking next to a line.
        // Start the debugger by clicking on the bug or pressing shift + F9.
        // Follow the control-flow and see what happens.
        String s = "String";
        String s1 = "String";
        if (s == s1) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }

        // Use F7 to step inside a method and see what happened.
        int x = 0;
        increment(x);
        System.out.println("main: " + x);

        // Follow the method call and check at which time which method has which X value.
        foo(6);

        // If you have set multiple breakpoints and want to skip to the next one press F9.
        int i = 0;
        for (i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        int j = i;

        // assert statements can be useful but arent that common.
        // Please try to avoid passing null values at any cost.
        printObject(null);

    }


    public static void increment(int x) {
        x += 1;
        System.out.println("increment: " + x);
    }


    public static int foo(int x) {
        if (x < 4) {
            x = bar(x);
        } else {
            x = foo(x - 5);
        }
        return x + 2;

    }

    private static int bar(int x) {
        x *= someMethod(x);
        return x;
    }

    private static int someMethod(int x) {
        x += x;
        return x;
    }

    public static void printObject(Object o) {
        /*
         * You can use the native assert statement to check certain conditions.
         * If the specified condition holds true execution will continue.
         * Otherwise the program is stopped with an error message.
         * NOTE: assertions are only checked if the debugger is activated -> it is only useful for you as a programmer.
         */
        assert o != null;
        System.out.println(o.toString());
    }

}
