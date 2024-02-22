package opgave04;

import opgave04.models.TheaterFloor;

public class Opgave04 {
    public static void main(String[] args) {
        TheaterFloor theaterFloor = new TheaterFloor();
        theaterFloor.buySeat(10);
        theaterFloor.buySeat(10);
        theaterFloor.printTheaterFloor();
    }
}
