package lesson5;

public interface Repairable {

  /**
   * Typically your interfaces will end with "able". An interface is the idea for behaviour that is
   * not concrete to a class but a broader idea. Interfaces can be used as a type for a variable:
   * Repairable someObject; All methods in an interface are public and abstract. A method can
   * implement multiple interfaces. But every non-abstract class needs to implement the definition
   * for each method.
   */

  void repair();

}
