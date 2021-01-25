package lesson10;

import org.junit.jupiter.api.function.Executable;

@SuppressWarnings("ALL")
public class HistoryOfLambas {

  public static void main(String[] args) {


    /* Lambdas originally come from the avoidance of anonymous classes.
     * Imagine we want to measure the time a function takes to execute.
     * Therefore we need a function that accepts a function-as-parameter.
     * That is not directly possible.
     * Instead we can pass an object of a class which has exactly one method which we then call.
     * Executable is a class fitting for this purpose.
     */
    Executable method = new ToBeMeasured();
    measureExecutionTime(method);

    /*
     * However now we declared a complete class only for this purpose.
     * We could avoid it by declaring an anonymous class.
     * That is a class witch has no name and can therefore only be used once.
     */
    Executable methodAnon = new Executable() { // { } marks the body for our class.
      @Override
      public void execute() throws Throwable { // here we declare just like in a normal class.
        for (int i = 0; i < 1000000; ++i) {
          System.out.println(i);
        }
      }
    };

    /* As you may agree this does not look do great.
     * We have a tiny bit of code and 4 lines of boiler-plate code.
     * IMPORTANT: A class with one abstract method or a functional interface can be replaced by lambdas.
     */
    measureExecutionTime(
        () -> { // Use { } for lambdas with more than one statement (to be avoided).
          for (int i = 0; i < 1000000; ++i) {
            System.out.println(i);
          }
        });

  }


  // We want to pass a function as an argument.
  private static void measureExecutionTime(Executable executable) {
    long start = System.nanoTime();
    try {
      executable.execute();
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }
    long end = System.nanoTime();
    long execution = end - start;
    // execution time
    System.out.println("Execution time: " + execution + " nanoseconds");

  }

  private static class ToBeMeasured implements Executable {

    @Override
    public void execute() throws Throwable {
      for (int i = 0; i < 1000000; ++i) {
        System.out.println(i);
      }
    }
  }

}
