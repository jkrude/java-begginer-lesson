package lesson5;

public class Example {

  public static void main(String[] args) {
    Porsche p = new Porsche();
    // Polymorphism:
    Car car = new Porsche();
    Repairable repairable = new Porsche();

    // If we would have a class plane that implements Repairable too we could save all repairable object in one array.
    // Imagine we are a big workshop and have a list of all objects that need to be repaired.
    Repairable[] array = {p, car, repairable}; // Handy method to declare an array.
    for (Repairable r : array) { // Range based for loop → awesome!
      // It is not important for us what the concrete object is.
      // For us it is only necessary that it can be repaired → which is asserted by the interface.
      r.repair();
    }
  }

}
