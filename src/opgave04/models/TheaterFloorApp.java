package opgave04.models;

import java.util.Scanner;

public class TheaterFloorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int seat;
        boolean availableSeatSelected = false;
        TheaterFloor theaterFloor = new TheaterFloor();
        theaterFloor.buySeat(1,1);
        while (!availableSeatSelected) {
            System.out.print("Vælg række: ");
            row = sc.nextInt();
            System.out.print("\nVælg sæde: ");
            seat = sc.nextInt();
            System.out.println();
            if (!theaterFloor.seatSold(row,seat)) {
                theaterFloor.buySeat(row,seat);
                System.out.println("Du har købt plads på række "+ row + " sæde " + seat);
                availableSeatSelected = true;
            } else {
                System.out.println("Det valgte sæde er optaget, vælg et andet\n");
            }
        }

    }
}
