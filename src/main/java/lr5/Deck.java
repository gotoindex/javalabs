package lr5;

import java.util.ArrayList;

public class Deck {

    ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public int getSumPoints() {
        int sum = 0;
        for (Card card: cards) sum += card.value.getPoints();
        return sum;
    }

    public void fill() {
        for (CardSuit suit: CardSuit.values()) {
            for (CardValue value: CardValue.values()) cards.add(new Card(value, suit));
        }
    }
}
