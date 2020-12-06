package lr5;

public class ComputerPlayer extends Player {

    public void printHand() {
        System.out.print("Computer's hand is: ");
        printAllCards();
    }

    public void makeAMove(Deck deck) {
        while (hand.getSumPoints() < 17) drawCard(deck);
        printFirstCard();
    }

    public void printFirstCard() {
        System.out.println("First computer's card is: " + hand.cards.get(0).getString());
    }
}
