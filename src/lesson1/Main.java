package lesson1;

import lesson1.Washer.Program;

public class Main {

  enum Clothing {
    T_SHIRT,
    WOOL_SWEATER
  }

  public static void main(String[] args) {
    Washer washer = new Washer();
    startWashCycle(Clothing.T_SHIRT, washer, 3.141f, 3);
  }

  /*
   * Functions are very useful for modeling repeating behaviour.
   * You write the behaviour once an can call/use the method as often as you want.
   * A method (just like any variable) requires a return type.
   * Optionally, methods can have arguments.
   *   Notice: Java dos not now about the meaning of a variable so the position is relevant!
   *    calculateDetergentLevel(100.0f,50.0f) will return something else than calculateDetergentLevel(50.0f, 100.0f)
   * In Java (in contrast to) you can use a method before you declare it.
   * (just ignore the static keyword for now)
   *
   * return type  name       arguments
   * void         printTime( int timeInMinutes)
   */

  static void printTime(int timeInMinutes) {
    String printText = "" + "RemindMe! "; // You can concatenate strings!
    printText += timeInMinutes; // Int is implicitly casted to String!
    printText += " minutes.";
    System.out.println(printText); // Print the text to the console.

    // TODO Hm maybe we want it in hours?
    int hours = 0;
    int minutes = 0;
    float combined = 0.0f; // 3 std. 30min => 3.5std
    System.out.println("In hours: " + hours + " and minutes: " + minutes);
    System.out.println("Combined: " + combined);
  }


  static float calculateDetergentLevel(float clothWeight, float dirtyFactor) {
    // How much detergent do we need?
    float detergentLevel = 15.0f; // Create a new variable and assign it a value.
    detergentLevel = detergentLevel + clothWeight / 2; // Add a factor.
    detergentLevel *= dirtyFactor; // Short way. Equal to detergentLevel = detergent * dirtyFactor.
    return detergentLevel;
  }


  static void startWashCycle(Clothing clothType, Washer washer, float clothWeight,
      float dirtyFactor) {
    /* Manual:
     * open washer
     * fill in clothes
     * close door
     * fill in detergent (white or colored)
     * choose program (depends on your clothes)
     */

    // You call a method like this:
    // We capture the returned value in a variable.
    float detergentLevel = calculateDetergentLevel(clothWeight, dirtyFactor);

    // Commands are executed one after another. Try to switch them and see what happens.
    washer.open();
    washer.putInClothes();
    washer.closeDoor();
    washer.fillDetergent(detergentLevel);

    /*
     * As we now the code execution works line by line / command by command.
     * But often we want to execute something only if a certain condition holds true.
     * In those cases we can use if statements:
     *  if(<condition>){ // <condition> has to be (or convertible to) of type boolean
     *    <conditional behaviour> // everything between the { } will be executed if the condition is true
     *  }
     *
     * We can chain conditions with an else-if statement
     * ...
     * else if(<condition>){ // If the previous condition was false -> test this one
     *  <conditional behaviour> // if the above condition holds true -> execute
     *  }
     *
     * If we only write an else statement we can execute code in all cases were the above statement was false.
     */
    // Washing-program will be the following:
    // EASY_CARE: if clothType == Clothing.T_SHIRT
    // WOOL: if clothType != Clothing.T_SHIRT and clothType == Clothing.T_SHIRT
    // STANDARD: if clothType != Clothing.T_SHIRT and clothType != Clothing.T_SHIRT

    if (clothType == Clothing.T_SHIRT) { // Test initial condition.

      washer.chooseProgram(Program.EASY_CARE);

    } else if (clothType
        == Clothing.WOOL_SWEATER) { // If above statement was false -> test this one

      washer.chooseProgram(Program.WOOL);

    } else { // If both of the above conditions were false -> execute

      washer.chooseProgram(Program.STANDARD);
    }

    washer.start();
    // Method call without a return value.
    printTime(washer.getTime());

  }
}
