package lr5;

public class Card {

    public CardValue value;
    public CardSuit suit;

    public Card(CardValue value, CardSuit suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getString() {
        return value.getName() + suit;
    }
}
