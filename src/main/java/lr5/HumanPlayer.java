package lr5;

import java.util.Scanner;

public class HumanPlayer extends Player {

    private static final Scanner INPUT = new Scanner(System.in);

    public void printHand() {
        System.out.print("Your hand is: ");
        printAllCards();
    }

    public void makeAMove(Deck deck) {
        printHand();
        System.out.print("Do you want to draw another card? [Y/n]: ");
        boolean choice = INPUT.hasNextLine() && (INPUT.nextLine().toLowerCase().equals("y"));
        if (choice) {
            drawCard(deck);
            if (hand.getSumPoints() <= 21) makeAMove(deck);
        }
    }
}
