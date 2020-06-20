package LessonsFourAndFive;

public class ShipApp {
    public static void main(String[] args) {

        Starship dreadnought = new Starship();
        Starship cruiser = new Starship("NewHope", 88556357, 24, 1256000);
        Starship lightTrooper = new Starship("StarKiller", 5656987, 1, 8680000);
        Starship carrier = new Starship("Yavin", 89568788469L,  1254, 854895);
        Starship longCruiser = new Starship("Berserk", 84698487, 74, 895647);


        Starship [] shipFleet = new Starship[] {dreadnought, cruiser, lightTrooper, carrier, longCruiser };


        for(int i = 0; i < shipFleet.length; i++) {
            System.out.print(shipFleet [i] + " " );
        }
        System.out.println();

        System.out.println(findShipIndex(shipFleet, longCruiser));




    }



    public static int findShipIndex(Starship [] shipList, Starship starship) {

        for(int i = 0; i < shipList.length; i++) {
            if (starship.hashCode() == shipList[i].hashCode() & starship.equals(shipList[i])) {
                return i;
            }
        }

        return 0;
    }






}
