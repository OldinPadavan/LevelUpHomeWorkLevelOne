package LessonsFourAndFive;

import java.util.Objects;

public class Starship {

    private long speed;
    private long weight;
    private int crewCount;
    private String shipName;


    public Starship() {

    }

    public Starship(String name, long weight, int crewCount, long speed) {
        shipName = name;
        this.speed = speed;
        this.weight = weight;
        this.crewCount = crewCount;
    }

    @Override
    public String toString() {
        return "Starship " + "\"" + shipName + "\"" + ": {" +
                "speed = " + speed +
                ", weight = " + weight +
                ", crewCount = " + crewCount + '}';
    }

    @Override
    public boolean equals(Object object) {

        if(object == this) { return true; }

        if( object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Starship ship = (Starship) object;

        return Objects.equals(shipName, ship.shipName);

    }

    @Override
    public int hashCode() {

        return Objects.hashCode(shipName);

    }





}


