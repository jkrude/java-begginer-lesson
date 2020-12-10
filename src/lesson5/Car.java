package lesson5;

/**
 * An abstract class can not initialised → you cant write new Car(); If a class has an abstract
 * methods it is required to bee abstract. But you can declare abstract classed without abstract
 * methods.
 */

public abstract class Car implements Repairable {

  /**
   * This is the same for all cars.
   */
  private String color;

  private double energyLevel;

  protected int numberOfTires;

  public void refill(double energy) {
    energyLevel += energy;
  }

  /**
   * The behaviour of run is different for cars (electric / gasoline use usw.) But every car should
   * be able tu run, therefore it should have a method run.
   */
  public abstract void run();

  // We dont need to implement repair form the interface because our class is abstract.
  // But we can if we want to.
  @Override
  public void repair() {
    System.out.println("Repair me");

  }
}
