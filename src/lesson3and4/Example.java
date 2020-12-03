package lesson3and4;

public class Example {

  public static void main(String[] args) {

    // Create a person object ( as we already know)
    Person someone = new Person("someone", 0);

    // name and age are inherited attributes from Person!

    // Create a new professor → The constructor is inherited by the person class!
    Professor lucia = new Professor("lucia", 42);

    // Create a new student → students need an extra matriculation-number
    Student joachim = new Student("joachim", 53, 1245325235);

    someone.getName();
    // getName is inherited from Person!
    lucia.getName();

    /*
     * What happens if you dont initialize an object?
     */
    Person nobody = null; // not initialized → is nothing → null
    if (nobody == null) {
      System.out.println("nobody is really nobody.");
    }
    // You cant use methods / access atributes from something that doesnt exist!
    nobody.getName();

    // Create a new person → nobody becomes someone
    nobody = new Person("heinz", 64);
    nobody.getName();

    /*
     * Polymorphic objects
     */
    Person person = new Person("person", 1);
    Professor prof = new Professor("prof", 55);
    person = prof;
    person = new Student("student", 18, 15151515);


  }

}
