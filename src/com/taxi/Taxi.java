package com.taxi;

public class Taxi{

   private Driver driver;
   private Human[] passengers = new Human[4];
   private int passengerCount;

   public Taxi(Driver driver) {
      this.driver = driver;
   }

   @Override
   public boolean equals(Object obj) {
      boolean thereAre = false;
      if (obj instanceof Taxi){
         for (Human passagerT1: this.passengers){
            System.out.println("1:"+passagerT1);
            for (Human passagerT2: ((Taxi) obj).passengers){
               System.out.println("2:"+passagerT2);
               if (passagerT1.getName().equals(passagerT2.getName())
                       || passagerT1.getForname().equals(passagerT2.getForname())
                       || passagerT1.getAge() == passagerT2.getAge()){
                  thereAre = true;
                  break;
               }
            }
            if (!thereAre){
               return false;
            }else{
               thereAre = false;
            }
         }
         if (driver.getName().equals(((Taxi) obj).getDriver().getName())
                 && driver.getForname().equals(((Taxi) obj).getDriver().getForname())
                 && driver.getAge() == ((Taxi) obj).getDriver().getAge()){
            return true;
         }
         return false;
      }
      return false;
   }

   public void getDriverName() {
      System.out.println("Driver: " + driver.getForname() + " " + driver.getName());
   }

   public Driver getDriver() {
      return driver;
   }

   public int getPassengerCount() {
      return passengerCount;
   }

   public void add(Human passenger){
      if (passengerCount < 4) {
         passengers[passengerCount] = passenger;
         passengerCount++;
         System.out.println(passenger.getForname() + " " + passenger.getName() + " gets in.");
      } else {
         System.out.println("We are sorry " + passenger.getForname() + " "
                 + passenger.getName() + ". The taxi is full.");
      }
   }

   public Object[] allGetOut(){
      Human[] outPassengers = passengers;
      passengerCount = 0;
      passengers = new Human[4];
      return outPassengers;
   }
}