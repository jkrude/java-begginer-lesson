---
layout: post
title:  "4. Inheritance"
date:   2020-12-03 12:26:54 +0100
permalink: 4-oop2.html
---
## Slides
- [Here](https://github.com/jkrude/java-beginner-lesson/blob/master/slides/04-oop2.pdf)

## Exercise
In this exercise we will extend the `Human` and `Taxi` class override some methods and use the `equals` method.
The exercise builds on top of the last one.
If you don't have the full solution have a look [here](https://github.com/jkrude/java-beginner-lesson/tree/master/src/lesson3and4/exercise3Solution).

#### Human class
- `Humans` should override the `toString` method: It should use the forename and name
    - for example: `juergen.toString()= "Juergen Staub"`
- `Humans` should override the `equals` method too
    - Two humans are equal if both the name and forename are equal

#### Taxi class
- `Taxi` has its own `equals`method too
    - Two taxis are equals if all passenger, and the driver are equal
    - Hint: *use a for-loop to iterate over the passenger in the array*
- The driver of the taxi will be of the new type `Driver`

#### Driver class
- driver are humans too (no surprise) → extend
- additionally, to the human class each driver has three *extra* variables
    - they mark if the driver is allowed to drive a car, truck, motorcycle (`boolean`)

#### PetTaxi class
- a pet taxi is a special taxi
- in addition, each passenger is allowed to take one pet with them
    - save the pets in a separate `Array` of strings (the string is the name of the pet)
    - To enable a passenger to take his pet with him, an add-method should be provided
        - the method takes a `Human` and a `String` (pet) and return void
        - why is it okay to declare another add method like this: `void add(Human human, String pet)`?
- you will need to change the behaviour of the `allGetOut` method, so that the pets will exit too
    - the method should now return the pets (`Array` of strings)
- at last the `equals`-method needs to be adjusted, because there is an additional condition:
    - the same conditions from the taxi method hold true
    - additionally, the array of pets needs to be equal
        - Hint: *use super.equals() in order to avoid code-duplication*
- Of course `Driver` are allowed as passengers in pet-taxis
    - do you have to change the `PetTaxi.add` methods?
    
    
### Example
```java
  Driver juergen = new Driver("Juergen", "Staub");
  juergen.canDrivePKW = true; // You can use any other variable name than canDrivePKW
  System.out.printl(juergen.toString());
  
  Human andrea = new Human("Andrea", "Bora");
  Human leah = new Human("Leah", "Posh");
  System.out.printl(andrea.toString());
  
  Taxi taxi = new Taxi(juergen); // What happens if you would try to drive a Taxi with a normal Human?
  
  taxi.add(andrea);
  
  Taxi cloneTaxi = new Taxi(juergen);
  cloneTaxi.add(andrea);
  if(cloneTaxi == taxi){
      System.out.printl("== is true")
  }
  if(cloneTaxi.equals(taxi)){
      System.out.printl("equals is true")
  }
  
  PetTaxi petTaxi = new PetTaxi(juergen);
  petTaxi.add(andrea, "Schnuffel");
  petTaxi.add(leah);
  
  PetTaxi clonedPetTaxi = new PetTaxi(juergen);
  clonedPetTaxi.add(andrea, "Schnuffel");
  clonedPetTaxi.add(leah);
  if(petTaxi.equals(clonedTaxi)){
  	System.out.printl("Both taxis are equal");    
  }
  petTaxi.allGetOut();
```

This should be the output:
```java
"Driver: Juergen Staub"
"Andrea Bora"
// taxi.add:
"Andrea Bora gets in."
"Andrea Bora gets in." // taxi-clone
"equals is true" // taxis are equal
// petTaxi.add:
"Andrea Bora gets in (with pet)."
"Leah Posh gets in."
"Andrea Bora gets in (with pet)." // petTaxi-clone
"Leah Posh gets in."
"Both taxis are equal" // petTaxis are equal
```