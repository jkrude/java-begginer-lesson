package com.taxi;

public class Driver extends Human {

   private Human driver;
   private boolean car;
   private boolean truck = false;
   private boolean motorcycle = false;

   public Driver(Human driver, boolean car) {
      super(driver.getName(), driver.getForname(), driver.getAge());
      this.driver = driver;
   }
   public Driver(Human driver, boolean car, boolean truck) {
      super(driver.getName(), driver.getForname(), driver.getAge());
      this.driver = driver;
   }
   public Driver(Human driver,  boolean car, boolean truck, boolean motorcycle) {
      super(driver.getName(), driver.getForname(), driver.getAge());
      this.driver = driver;
   }
}
