package lesson3and4;

/*
 * Everything in Java is a class.
 * A class represents the idea of something. You can use them to model real-life things in your
 * program. Declared classes can be used as type for new variables. Student john; We typically write
 * best-practise: Write class-names with PascalCase.
 */

class Student extends Person {

  /*
   * Classes can have variables and methods.
   * You can declare them like you already know:
   *    <Type> <Name>;
   * or <Type> <Name> = <initial value>;
   */
  long matriculationNumber;
  static long numberOfStudents = 0;

  public Student(String name, int age, long matriculationNumber) {
    super(name, age);
    Student.numberOfStudents++;
    this.matriculationNumber = matriculationNumber;
  }

  /*
   * Getter: In Java you usually access object variables with extra functions
   * You can declare methods just as you already know:
   * <type> <methodName>(<parameter>){
   *  <behaviour>
   *  <optional: return>
   *  }
   */

  public long getMatriculationNumber() {
    return matriculationNumber;
  }

  @Override
  public String toString() {
    return super.toString() + ", matriculationNumber=" + this.matriculationNumber;
  }
}
