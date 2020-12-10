package lesson3and4.solution;

public class PetTaxi extends Taxi{

    String[] pets;
    int petCount;

    public PetTaxi(Driver driver) {
        super(driver);
        pets = new String[4];
        petCount = 0;
    }

    public void add(Human human, String pet){
        if (passengerCount < 4) {
            super.add(human);
            pets[petCount] = pet;
            petCount++;
            System.out.println("Pet " + pet + " gets in as well.");
        }
    }

    public String[] passengersAndPetsGetOut() {
        super.allGetOut();
        String[] oldPets = pets;
        pets = new String[4];
        return oldPets;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof PetTaxi)) {
            PetTaxi petTaxiObject = (PetTaxi) obj;
            if (petCount != petTaxiObject.petCount) {
                return false;
            }
            for (int i=0; i<petCount; i++){
                if (!pets[i].equals(petTaxiObject.pets[i])){
                    return false;
                }
            }
            return super.equals(obj);
        }
        return false;
    }
}
