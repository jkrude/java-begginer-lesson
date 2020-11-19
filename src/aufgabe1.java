import java.lang.reflect.Array;
import java.util.Scanner;
public class aufgabe1 {

   public static void main(String[] args) {

      aufgabe_1();
      aufgabe_2();
   }

   private static void aufgabe_1(){
      Scanner scan = new Scanner(System.in);
      System.out.print("Write a double number: ");
      double x = scan.nextDouble();

      for (int i = 1; i < 9; i++) {
         double div = x % i;
         if (div == 0.0){
            System.out.println("Mod:" + i);
         }
      }
   }

   private static void aufgabe_2(){
      String text = "gbcFarnxl";
      int schift = 13;
      System.out.print("Word is: ");
      for (int i = 0; i < text.length(); i++) {
         char character = text.charAt(i);
         int ch;
         ch = (int) character + schift;
         System.out.print((char) ch);
      }
   }
}
