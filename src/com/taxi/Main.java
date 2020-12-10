package com.taxi;

public class Main {

   public static void main(String[] args) {

      Human john = new Human("John", "Blancko", 24);
//      System.out.println(john.toString());
      System.out.println(john.equals(new Human("John", "Blancko", 29)));

      Human driver1 = new Human("Garry", "Troll", 32);
      Human driver2 = new Human("Garry", "Troll", 32);

      Taxi taxi = new Taxi(new Driver(driver1, true));
      Taxi taxi2 = new Taxi(new Driver(driver2, true));

      for (int i = 0; i < 4; i++) {
         taxi.add(new Human(("Name_" + i), ("Forname_" + i), i+21));
      }
      for (int i = 3; i >= 0 ; i--) {
         taxi2.add(new Human(("Name_" + i), ("Forname_" + i), i+21));
      }
      System.out.println(taxi.equals(taxi2));

   }
}
