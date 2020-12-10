package lesson3and4.solution;

public class Human {
    String forename;
    String name;

    public Human(String forename, String name) {
        this.forename = forename;
        this.name = name;
    }

    public String getForename() {
        return forename;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return forename + " " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Human){
            Human humanObject = (Human) obj;
            return forename.equals(humanObject.getForename()) && name.equals(humanObject.getName());
        }
        return false;
    }
}
