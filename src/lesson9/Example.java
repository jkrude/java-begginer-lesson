package lesson9;

public class Example {


  /*
   * Image you have a function which should return different return-codes:
   *  SUCCESS
   *  FAILURE
   *  SCHEDULED
   *
   * You could return integer (0, 1, 2) but someone will be quite confused.
   * Instead you could create an enum:
   * An enum is a collection of constant values, which can be used as values.
   * The enum you declared can be used a normal type (similar to a class).
   * Additionally enums can have member variables and functions for more complex use-cases.
   * You already encountered enums in the first lesson in lesson1/Main and lesson1/Washer!
   */
  public enum ReturnType {
    SUCCESS,
    FAILURE,
    SCHEDULED
  }

  // Someone who utilises this function will be confused, what those numbers mean.
  public static int someComplexFunction(int x) {
    if (x < 0) {
      // Do something
      return 1; // Success.
    } else if (x == 0) {
      // Do something else
      return 2; // Failure
    } else {
      // Execute later
      return 3; // Scheduled
    }
  }

  // Better:
  public static ReturnType someOtherComplexFunction(int x) {
    if (x < 0) {
      // Do something
      return ReturnType.SUCCESS;
    } else if (x == 0) {
      // Do something else
      return ReturnType.FAILURE;
    } else {
      // Execute later
      return ReturnType.SCHEDULED;
    }
  }


  public static void main(String[] args) {

    int x = 3;
    // Implicit knowledge: Number has meaning and which number means what.
    int y = someComplexFunction(x);

    // It is clear that the return type has a special meaning and it is explicitly given by the enum!
    ReturnType r = someOtherComplexFunction(x);

    // Switch cases can be used to avoid multiple if statements:
    // Switch cases are used commonly to check the state of an enum.
    // Have a look in lesson1/Washer and see where a switch-case would be useful.
    switch (r) {
      // case SUCCESS: is like a if(r == SUCCESS)
      case SUCCESS:
        System.out.println("Huray");
        break; // Dont forget to break or return otherwise the switch case will be continued.
      case FAILURE:
        System.out.println("Oh no");
        break;
      case SCHEDULED:
        System.out.println("Later");
        break;
      // default is like an else case without a condition.
      default:
        throw new IllegalStateException("Unexpected value: " + r);
    }
  }
}
