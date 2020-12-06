package lr5;

import java.util.Random;

public abstract class Player {

    public static final Random generator = new Random();
    public Deck hand;

    public Player() {
        this.hand = new Deck();
    }

    public void drawCard(Deck deck) {
        int random_card_index = generator.nextInt(deck.cards.size());
        hand.cards.add(deck.cards.get(random_card_index));
        deck.cards.remove(random_card_index);
    }

    public void printAllCards() {
        for (Card card: hand.cards) System.out.print(card.getString() + ", ");
        System.out.println("total points: " + hand.getSumPoints());
    }

    public abstract void printHand();
    public abstract void makeAMove(Deck deck);
}
