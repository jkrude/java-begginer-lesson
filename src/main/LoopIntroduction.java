package main;

public class LoopIntroduction {

  static int sleep(int dayOfYear) {
    // More accurate dayOfYear += random number between 1 and 5.
    return ++dayOfYear;
  }

  static boolean notFeelingGuiltyAnymore(int studyHrs) {
    // Some dummy method
    return studyHrs == 2;
  }

  public static void main(String[] args) {
    LoopIntroduction.loopContinue();
  }


  /*
   * What are loops?
   * Define repeating behaviour that is executed if a certain condition holds true
   */

  /* check if <condition> is true -> execute <behaviour> -> check condition -> ... -> execute next
   *
   * while(<condition>){
   *  <behaviour>
   * }
   */
  static void whileLoop(){
    // Day of year ( [0,356] )
    int tomorrow = 115;
    int examDate = 120;

    // Solution:
    while(examDate != tomorrow){
      System.out.println("Kalm");
      tomorrow = sleep(tomorrow);
    }
    // while has ended → the condition is true -> exam == tomorrow
    System.out.println(examDate == tomorrow);
    System.out.println("Panic");

  }

  /*
   * while loop but with a updating variable
   *  for (<variable>, <condition>, <update>){
   *    <behaviour>
   *  }
   */
  static void forLoop(){
    // Solution:
    for(int studyHrs = 0; studyHrs < 4; studyHrs++){
      System.out.println("Study");
    }
  }


  /*
   * There are cases where want to diverge from the default-loop-execution
   * Both keywords can be used in while and for loops
   */

  /*
   * break: exit the loop
   */
  static void loopBreak(){
    // Break and continue:
    for(int studyHrs = 0; studyHrs < 4; studyHrs++){
      if(notFeelingGuiltyAnymore(studyHrs)){
        break;
      }
      System.out.println("Study: " + studyHrs);
    }
    // Loop is over:
    System.out.println("Do something else");
  }

  /*
   * continue: ignore the rest and jump back to condition-check
   */
  static void loopContinue(){
    // Training-schedule:
    for (int dayOfWeak = 1; dayOfWeak <= 5; dayOfWeak++) {
      System.out.println("Train legs");

      if(dayOfWeak == 2){ // Skip back on tuesdays ( second day of the week)
        continue;
      }
      System.out.println("Train back");
    }
  }
}
