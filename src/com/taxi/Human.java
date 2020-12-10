package com.taxi;

public class Human {

   private String name;
   private String forname;
   private int age;

   public Human(String name, String forname,int age) {
      this.age = age;
      this.name = name;
      this.forname = forname;
   }

   public String getName() {
      return name;
   }

   public String getForname() {
      return forname;
   }

   public int getAge() {
      return age;
   }

   @Override
   public String toString() {
      return this.name + " " + this.forname;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj instanceof Human){
         return this.name.equals(((Human) obj).name) && this.forname.equals(((Human) obj).forname);
      }
      return false;
   }

}
