package lesson5;

/*
 * Porsche is a concrete class.
 * Therefore all abstract methods have to be implemented.
 */

public class Porsche extends Car {

  @Override
  public void run() {
    System.out.println("Hallo");
  }

}
