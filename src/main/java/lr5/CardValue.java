package lr5;

public enum CardValue {
    TWO("2", 2),  // Two
    THREE("3", 3),  // Three
    FOUR("4", 4),  // Four
    FIVE("5", 5),  // Five
    SIX("6", 6),  // Six
    SEVEN("7", 7),  // Seven
    EIGHT("8", 8),  // Eight
    NINE("9", 9),  // Nine
    TEN("10", 10),  // Ten
    JACK("J", 10),  // Jack
    QUEEN("Q", 10),  // Queen
    KING("K", 10),  // King
    ACE("A", 1);  // Ace

    private final String name;
    private final int points;

    CardValue(String s, int i) {
        this.name = s;
        this.points = i;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}
