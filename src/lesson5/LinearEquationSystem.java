package lesson5;

public class LinearEquationSystem {

  /*
   * Often the access to instances and methods should be regulated.
   * In this example the user of this class is only interested in the solve method.
   * The other methods are only used for convenience by solve().
   * In order to be more clear about what is important for a user we restrict the access.
   *
   *  public: It is accessible from everywhere.
   *  private: Only this specific class can access.
   *  protected: All children of this class can access it too.
   *  package-private (we dont write anything): Access for all classes that are defined in the same package.
   */

  private double[][] terms; // 2D array = matrix
  private double[] results;

  public LinearEquationSystem(double[][] terms, double[] results) {
    this.terms = terms;
    this.results = results;
  }

  public double[] solve() {
    // some swapping
    // some multiplications
    // some additions of rows
    // super smart stuff
    return null;
  }

  private void swapRows() {
    // interim step
  }

  private void multiplyRow() {
    // interim step
  }

  private void addRow() {
    // interim step
  }
}
