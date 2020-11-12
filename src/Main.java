public class Main {

  enum CLOTH_TYPE{
    T_SHIRTS,
    WOOL_SWEATER,
    MIXED
  }

  public static void main(String[] args) {
    Washer washer = new Washer();
    startWashCycle(Main.CLOTH_TYPE.T_SHIRTS, washer, 3.141f, 3);
  }

  static void startWashCycle(Main.CLOTH_TYPE clothType, Washer washer, float clothWeight, float dirtyFactor) {
    /* Manual:
     * open washer
     * fill in clothes
     * close door
     * fill in detergent (white or colored)
     * choose program (depends on your clothes)
     */

    // How much detergent do we need?
    float detergentLevel = 15.0f; // Create a new variable and assign it a value.
    detergentLevel = detergentLevel + clothWeight / 2; // Add a factor.
    detergentLevel *= dirtyFactor; // Short way. Equal to detergentLevel = detergent * dirtyFactor.

    // Commands are executed one after another. Try to switch them and see what happens.
    washer.open();
    washer.putInClothes();
    washer.closeDoor();
    washer.fillDetergent(detergentLevel);
    // TODO Choose program depending on cloth type.
    washer.chooseProgram(Washer.Program.STANDARD);
    washer.start();


    int timeInMinutes = washer.getTime();

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
}
