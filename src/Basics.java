public class Basics {

    public static void main(String[] args) {
        /*
         * To execute all the methods just click the little right arrow next to this method
         *
         * If there is no arrow, follow these steps:
         * 1. On the left side: Click with a right click on the directory src
         * 2. Select "Mark directory as >"
         * 3. Select "Sources Root"
         *
         * If you see the message "Project JDK is not defined", follow these steps:
         * 1. Click on "Setup SDK" in the top right corner
         * 2. Select "Download JDK"
         * 3. Confirm the pop up message
         *
         * If you have any problems shoot us an email! :)
         * */
        explainBasics();
        firstExercise();
        secondExercise();
        bonusExercise();
    }

    /* This is called a method. We will tell you everything you need to know
     * in the next lesson. For now you can just concentrate on everything within the methods.
     * */
    public static void explainBasics() {
        // Variables need to be initialized
        int x;
        // Then you assign a value to the variable
        x = 5;
        // You can also do this in only one step
        int y = 42;
        // Then you can add them together and store them in another variable
        int z = x + y;
        // You can use the short form for z = z + x => z += x;
        z += x;
        // Multiplying works the same way
        z *= z;
        /*
         * There are:
         *  addition: +
         *  subtraction: -
         *  multiply: *
         *  division: /
         *  modulo: %
         *  find out more here:
         *  https://www.tutorialspoint.com/java/java_basic_operators.htm
         */

        // Rational numbers are stored as floats
        float pi = 3.141f; // f is short for float


        // Text is stored in Strings
        String foo = "foo";
        // You can add strings too
        String bar = "bar";
        String foobar = foo + bar;
    }

    public static void firstExercise() {
        int hours = 2;
        int minutes = 30;
        float combinedTime = 0f;
        /* TODO
         * Combine hours and minutes into number (float)
         * e.g. 3 h 30 min => 3.5h
         * assign the result to the variable combinedTime
         * Tip: To divide numbers use: a / b
         * Write your code in the next line
         */


        System.out.println("Combined Time: " + combinedTime);
        System.out.println("It should be 10.466666.");
    }


    public static void secondExercise() {
        float temperatureInCelsius = 2;
        float temperatureInFahrenheit = 0f;
        /* TODO
         * Try to convert the temperature to celcius
         * e.g. 2°C => 35.6°F
         * Formula: https://de.wikipedia.org/wiki/Grad_Celsius#Umrechnung
         * Write your code in the next line
         */


        System.out.println("Temperature in Fahrenheit: " + temperatureInFahrenheit);
        System.out.println("It should be 86.0°F");

    }

    public static void bonusExercise() {
        int sum = 0;
        /* TODO
         * Calculate the sum of the numbers from 1 to 100
         * You can do this easily with a loop.
         * We will introduce them in the next lesson.
         * If you want, have a look at: https://techvidvan.com/tutorials/java-for-loop/
         * Write your code in the next line
         */


        System.out.println("Sum: " + sum);
        System.out.println("It should be 5050.");

    }
}
