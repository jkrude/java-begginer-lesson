package lesson8.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.junit.Test;

public class Exercise {

  public static void main(String[] args) {
    /* This program should calculate the sum to a list of given integers.
     * Fill in the gaps and test the program.
     * Why is a collection preferable over an array and what type of collection would be best suited?
     */
    System.out.println("Sum of all numbers program.");
    System.out.println("Enter numbers with enter");
    System.out.println("Calculate the sum by entering a non-number");
    Scanner scanner = new Scanner(System.in);
    do {
      try {
        int i = scanner.nextInt();
        // TODO: Add i to a collection
      } catch (InputMismatchException e) {
        break;
      }
    } while (true);

    // TODO: calculate sum
    int sum = 0;
    // for (...)
    System.out.println("The sum is " + sum);
  }

}
