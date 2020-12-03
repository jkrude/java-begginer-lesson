package lesson3and4;

import java.util.Objects;

/**
 * Everything inherits from object but you dont have to write extends Object.
 */

class Person {

  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  String getName() {
    System.out.println("Method in Person!");
    return name;
  }

  int getAge() {
    return age;
  }


  /*
   * You can redefine inherited methods.
   * → best practise is to mark it with @Override
   */

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return age == person.age &&
        Objects.equals(name, person.name);
  }

  /*
   * toString will be used to represent your object in text form
   */
  @Override
  public String toString() {
    return
        "name=" + name +
            ", age=" + age;
  }
}
