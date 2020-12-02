import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Aufgaben {

   static Scanner line = new Scanner(System.in);

   public static void main(String[] args) {
//        first();
//        mod_F();jccd
//        arrys();
//        line.close();

      // Hier you check how much people can get in the car.
      FunnyTaxi taxi = new FunnyTaxi();
      //Get some passegers in the car
      // TO CHECK an returned arr just comment it out
      for (int i = 0; i < 5; i++){
         System.out.println(taxi.addPasseger(("name_"+(i+1)), ("forname_"+(i+1))));
      }
      //Get out all passegers and check who is inside there
      int count = 1;
      Human[] arr = taxi.allGetOut();
      if (arr.length == 1){
         System.out.println("There is only a driver: " + arr[0].getName() + " " + arr[0].getForename());
      }else{
         for(Human passeger: arr){
            if (passeger != null){
               System.out.println("Passeger_" + count + ": " + passeger.getName() + " " + passeger.getForename());
            }
            count++;
         }
      }
   }
    /*
    public static void mod_F(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println("Int: " + i);
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("Double: " + d);
        String s = scan.nextLine();
        System.out.println("String: " + s);

    }
    public static void first(){
        System.out.println("Hi, I'm Jonhy! And who are you?");
//        String name = line.nextLine();
//        System.out.println("Hi, " + name);
    }
    public static void arrys(){
        int x = line.nextInt();
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = i;
        }
        System.out.println(arr);

        for(int elem:arr){
            System.out.println(elem + 1);
        }
    }
    */
}

class Human{
   String name, forename;

   Human(String name, String forename){
      this.name = name;
      this.forename = forename;
   }

   public String getName() {
      return name;
   }
   public String getForename() {
      return forename;
   }
}

class FunnyTaxi{

   int personIn = 0;
   String nameOfDriver;
   Human[] passegers = new Human[4];

   FunnyTaxi(){
      this.nameOfDriver = "Johny Blancko"; //default Taxi driver *)
   }
   FunnyTaxi(String nameOfDriver){
      this.nameOfDriver = nameOfDriver;
   }

   public String getNameOfDriver() {
      return nameOfDriver;
   }

   public String addPasseger(String name, String forname){
      if (personIn > 3){
         return "We are sorry, Lucky Fuke. The taxi is full.\n";
      }else{
         Human passeger = new Human(name, forname);
         this.passegers[personIn] = passeger;
         this.personIn++;
         return "Lucky Fuke gets in.\n";
      }
   }

   public Human[] allGetOut(){
      this.personIn = 0;
      for (Human passeger : passegers){
         if(passeger != null){
            return passegers;
         }else {
            Human driver = new Human(getNameOfDriver().split(" ")[0], getNameOfDriver().split(" ")[1]);
            Human[] oneDriver = new Human[1];
            oneDriver[0] = driver;
            return oneDriver;
         }
      }
      Arrays.fill(passegers, null);
      return null;
   }
}

