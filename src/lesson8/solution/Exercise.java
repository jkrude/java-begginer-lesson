package lesson8.solution;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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

    // Watch out where you declare a variable.
    // If you would declare list in try{} it would come out of scope after the closing }!
    List<Integer> list = new ArrayList<>();

    do {
      try {
        int i = scanner.nextInt();
        list.add(i);
      } catch (InputMismatchException e) {
        break;
      }
    } while (true);

    // Calculate sum.
    int sum = 0;
    /*
     * Alternatively:
     * for(int i=0; i < list.length(); ++i){
     *   sum += list.get(i);
     */
    for (int i : list) {
      sum += i;
    }
    System.out.println("The sum is " + sum);
  }

}
