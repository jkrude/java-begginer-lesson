package lesson3and4.solution;

public class Taxi {
    Human driver;
    Human[] passengers;
    int passengerCount;

    public Taxi(Driver driver) {
        this.driver = driver;
        passengers = new Human[4];
        this.passengerCount = 0;
    }

    public void getDriverName() {
        System.out.println("Driver: " + driver.getForename() + " " + driver.getName());
    }

    public void add(Human passenger){
        if (passengerCount < 4) {
            passengers[passengerCount] = passenger;
            passengerCount++;
            System.out.println(passenger.getForename() + " " + passenger.getName() + " gets in.");
        } else {
            System.out.println("We are sorry " + passenger.getForename() + " "
                    + passenger.getName() + ". The taxi is full.");
        }
    }

    public Human[] allGetOut(){
        Human[] outPassengers = passengers;
        passengerCount = 0;
        passengers = new Human[4];
        return outPassengers;
    }

    @Override
    public boolean equals(Object obj) {
        // Check if object is of class Taxi
        if (!(obj instanceof Taxi)) {
            return false;
        }
        // Cast object to type Taxi
        Taxi taxiObject = (Taxi) obj;

        if (!driver.equals(taxiObject.driver)) return false;
        for (int i=0; i<passengerCount; i++){
            if (!passengers[i].equals(taxiObject.passengers[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Driver juergen = new Driver("Juergen", "Staub");
        Human andrea = new Human("Andrea", "Bora");
        Human franzi = new Human("Franzi", "Ada");
        Human leah = new Human("Leah", "Posh");
        Human susi = new Human("Susi", "Fresh");
        Human lucky = new Human("Lucky", "Fuke");

        Taxi taxi = new Taxi(juergen);

        taxi.getDriverName();

        taxi.add(andrea);
        taxi.add(franzi);
        taxi.add(leah);
        taxi.add(susi);
        taxi.add(lucky);
        taxi.allGetOut();

        juergen.canDrivePKW = true; // You can use any other variable name than canDrivePKW
        System.out.println(juergen.toString());
        System.out.println(andrea.toString());
        // What happens if you would try to drive a Taxi with a normal Human?

        taxi.add(andrea);

        Taxi cloneTaxi = new Taxi(juergen);
        cloneTaxi.add(andrea);
        if(cloneTaxi == taxi){
            System.out.println("== is true");
        }
        if(cloneTaxi.equals(taxi)){
            System.out.println("equals is true");
        }

        PetTaxi petTaxi = new PetTaxi(juergen);
        petTaxi.add(andrea, "Schnuffel");
        petTaxi.add(leah);

        PetTaxi clonedPetTaxi = new PetTaxi(juergen);
        clonedPetTaxi.add(andrea, "Schnuffel");
        clonedPetTaxi.add(leah);
        if(petTaxi.equals(clonedPetTaxi)){
            System.out.println("Both taxis are equal");
        }
        petTaxi.passengersAndPetsGetOut();
    }

}
