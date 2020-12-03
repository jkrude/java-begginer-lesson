package lesson1;

import java.util.Optional;

public class Washer {

  public enum Program {
    STANDARD,
    EASY_CARE,
    WOOL
  }

  private boolean isRunning;
  private boolean isOpen;
  private boolean hasClothes;
  private float level;
  private Program currentProgram;

  public Washer() {
    isOpen = false;
    level = 0;
  }

  public void open() {
    if (isRunning) {
      System.out.println("Cant open while running.");
      return;
    }
    System.out.println("Opened");
    isOpen = true;
  }

  public void closeDoor() {
    isOpen = false;
    System.out.println("Closed");
  }

  public void putInClothes() {
    if (isRunning) {
      System.out.println("Currently running.");
    } else {
      hasClothes = true;
      System.out.println("Machine filled.");
    }
  }

  // Fill washer with detergent (in ml)
  public void fillDetergent(float detergentInMl) {
    if (isRunning) {
      System.out.println("Cant fill while running.");
    } else if (detergentInMl > 300) {
      System.out.println("This is not a barrel, it spilled all over the place!");
      level = 300;
    } else {
      level += detergentInMl;
    }
  }


  public void chooseProgram(Program p) {
    currentProgram = p;
    if (isRunning) {
      System.out.println("Resetting.");
    }
  }

  // Return time of the current program in minutes.
  public int getTime() {
    // TODO There must be a better solution
    if (currentProgram == Program.STANDARD) {
      return 120;
    } else if (currentProgram == Program.EASY_CARE) {
      return 90;
    } else if (currentProgram == Program.WOOL) {
      return 60;
    } else {
      System.out.println("No program chosen");
      return 0;
    }
  }

  public void start() {
    if (isRunning) {
      System.out.println("Already running");
    } else if (isOpen) {
      System.out.println("Please close the door before you start");
    } else if (currentProgram == null || level <= 0) {
      System.out.println("Choose a program or fill in detergent first.");
    } else {
      // Start program.
      isRunning = true;
      // Use detergent.
      level = 0.0f;
      System.out.println("rumble rumble rumble");
    }
  }

  public Optional<Program> getCurrProgram(){
    return Optional.ofNullable(currentProgram);
  }

  public boolean hasClothes(){
    return hasClothes;
  }
}

