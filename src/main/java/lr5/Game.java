package lr5;

public class Game {

    private HumanPlayer human;
    private ComputerPlayer computer;
    private Deck deck;

    public void startNewGame() {
        System.out.println("--- new game has started ---");
        clearAll();
        playGame();
        checkWhoWon();
    }

    private void clearAll() {
        this.human = new HumanPlayer();
        this.computer = new ComputerPlayer();
        this.deck = new Deck();
        this.deck.fill();
    }

    private void playGame() {
        human.drawCard(deck);
        human.drawCard(deck);
        computer.makeAMove(deck);
        human.makeAMove(deck);
    }

    private void checkWhoWon() {
        human.printHand();
        computer.printHand();
        output(human.hand.getSumPoints(), computer.hand.getSumPoints());
    }

    private void output(int human_points, int computer_points) {
        if (human_points <= 21) {
            if (human_points > computer_points || computer_points > 21) System.out.println("You win!");
            else if (human_points == computer_points) System.out.println("Draw!");
            else System.out.println("You lose!");
        }
        else System.out.println("Overtake!");
    }
}
