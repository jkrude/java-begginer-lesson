package lesson3and4.exercise3Solution;

public class Taxi {
    Human driver;
    Human[] passengers;
    int passengerCount;

    public Taxi(Human driver) {
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

    public static void main(String[] args) {
        Human juergen = new Human("Juergen", "Staub");
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
    }

}
