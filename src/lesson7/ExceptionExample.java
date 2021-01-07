package lesson7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {


    public static void main(String[] args) {
        // Exceptions trigger when unexpected or undefined behaviour occurs.
        // For example a division by 0 is undefined therefore an ArithmeticException is thrown.
        //int div = 1 / 0;

        // The most common exception occurs if you try to access an uninitialized object.
        Object o = null;
        //o.toString();

        // You can catch exceptions with a try{}catch(){} statement.
        try {
            o.toString();
        } catch (NullPointerException e) {
            e.printStackTrace(); // This is the absolut minimum error handling you could do.
        }

        try {
            safeRoot(-4);
        } catch (IllegalArgumentException e) {
            System.out.println("Nope");
        }

        // There are exceptions that you have to catch (every exception that does not inherit from RuntimeException).
        File file = new File("file");
        try {
            FileReader reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.err.println("File could not be opened.");
        }

        // Exceptions are objects too: You can create your own exceptions.
        if (2 + 2 != 4) {
            RuntimeException e = new RuntimeException("Oh oh");
            throw e;
        }
    }


    // You may know that your method executes "unsafe" code, if so you could annotate the method with "throws".
    private static double safeRoot(double number) throws IllegalArgumentException {
        if (number < 0d) {
            throw new IllegalArgumentException("Root is not defined for negative numbers");
        }
        return Math.sqrt(number);
    }
}
