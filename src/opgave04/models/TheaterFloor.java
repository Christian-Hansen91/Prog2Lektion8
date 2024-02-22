package opgave04.models;


public class TheaterFloor {
    int[][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
            { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
            { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
            { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
            { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

    /**
     * Hvis plads seat på række row er ledig reserveres pladsen og der returneres true
     * Der returneres false hvis pladsen er optaget.
     *
     * @param row
     * @param seat
     * @return
     */

    public boolean buySeat(int row, int seat) {
        boolean seatSold = false;
        if (seats[row][seat] != 0) {
            seats[row][seat] = 0;
            seatSold = true;
            System.out.println("sold row " + row + " seat " + seat);
        }
        return seatSold;
    }

    /**
     * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
     * der returneres true. Der returneres false, hvis der ikke er nogen pladser ledige
     * til den pågældende pris.
     *
     * @param price
     * @return
     */
    public boolean buySeat(int price) {
        int seat = 0;
        int row = 0;
        boolean foundSeat = false;
        while (!foundSeat && (row < seats.length && seat < seats[row].length)) {
            if (!seatSold(row, seat) && seats[row][seat] <= price) {
                buySeat(row,seat);
                foundSeat = true;
            } else {
                seat++;
            }
            if (seat == seats[row].length) {
                row++;
            }
        }
        return foundSeat;

    }

    public void printTheaterFloor() {
        System.out.println("De ledige pladser er angivet med deres pris");
        System.out.print("\tSæde: ");
        for (int i = 0; i < seats.length; i++) {
            System.out.printf("%4d",i+1);
        }
        System.out.println("\n-----------------------------------------------");
        for (int row = 0; row < seats.length; row++) {
            System.out.print("Række " + (row + 1) + ": ");
            for (int seat = 0; seat < seats[row].length; seat++) {
                if (seatSold(row, seat)) {
                    System.out.print(seats[row][seat]);
                } else {
                    System.out.print("--");
                }
                System.out.print(", ");
            }
            System.out.println();
        }
    }
    public boolean seatSold(int row, int seat) {
        return seats[row][seat] == 0;
    }

}

