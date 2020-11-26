package main;

/**
 * A class represents the idea of something. You can use them to model real-life things in your
 * program. Declared classes can be used as type for new variables. Student john; We typically write
 * class-names with camel-case style: CamelCase
 */

class Student {

  /*
   * Classes can have variables and methods.
   * You can declare them like you allready know:
   *    <Type> <Name>;
   * or <Type> <Name> = <initial value>;
   */
  String name;
  long matriculationNumber;
  static long numberOfStudents = 0;


  public Student(String name, long matriculationNumber) {
    Student.numberOfStudents++;
    this.name = name;
    this.matriculationNumber = matriculationNumber;
  }

  /*
   * Getter: In Java you usually access object variables with extra functions
   */
  public String getName() {
    return name;
  }

  public long getMatriculationNumber() {
    return matriculationNumber;
  }


  public static void main(String[] args) {

    // System.out.printl(String text) prints a text to the command line.
    // System is class, out is a static variable and printl is just a function from out.

    // Creating new instances of class Student.
    // Just like any other variable: <Type> <Name> = new <Constructor>
    Student john = new Student("John", 487345634);
    Student clara = new Student("Clara", 4636364);

    // Access variables with a point, The variable is bound to this exact object.
    long number = john.matriculationNumber;

    // static variables are owned by the hole class and not by one instance.
    System.out.println(Student.numberOfStudents);

    // Call methods just like normally, but with the object and a point.
    String johnName = john.getName();
    String claraName = clara.getName();
    // As you can see the names are different, because every student has its own name.
    System.out.println(johnName);
    System.out.println(claraName);
  }
}
