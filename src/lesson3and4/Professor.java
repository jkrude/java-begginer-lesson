package lesson3and4;

/*
 * You can model parent-child relationships with the keyword extends.
 * It means you class inherits the superclass.
 * Professor will have all the attributes and methods from Person.
 * super is like this but refers to the superclass
 */
class Professor extends Person {

  /*
   * We can define more variables and methods.
   * Those will only be usable for Professor objects and not for Persons.
   * That is why the keyword is called extends:
   * You inherit the existing attributes and methods but extend it by defining some more.
   */
  String faculty;

  // Constructors are not inherited directly,
  // you will need to define one if your superclass defined one.
  Professor(String name, int age) {
    super(name, age); // Here we call the constructor from our superclass.
  }

  String getFaculty() {
    return faculty;
  }

}











