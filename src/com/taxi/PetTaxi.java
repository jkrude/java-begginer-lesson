package com.taxi;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PetTaxi extends Taxi{

   private String[] pets;

   public PetTaxi(Driver driver) {
      super(driver);
   }

   public void addWithPet(Human passenger, String pet) {
      super.add(passenger);
      Array.set(this.pets, getPassengerCount(), pet);
      System.out.println(passenger.getForname() + " " + passenger.getName() + " gets in (with a pet). Pet: " + pet);
   }
   /*
   * We can't override a method ADD from Taxi class,
   * because we need to get others parameters more precisely 2 instead of one.
   * So @Override doesn't fit us.
   * */

   @Override
   public Object[] allGetOut() {
      super.allGetOut();
      String[] outPets = this.pets;
      Arrays.fill(this.pets, null);
      return outPets;
   }

   @Override
   public boolean equals(Object obj) {
      if (super.equals(obj)
              && pets.length == ((PetTaxi)obj).getPets().length){
         boolean thereArePet = false;
         String[] petsObj = ((PetTaxi) obj).getPets();
         for (String pet : pets) {
            for (String petObj : petsObj) {
               if (pet.equals(petObj)) {
                  thereArePet = true;
                  break;
               }else{
                  thereArePet = false;
               }
            }
            if (!thereArePet){
               return false;
            }
         }
      }else {
         return false;
      }
      return true;
   }

   public String[] getPets() {
      return pets;
   }
}
