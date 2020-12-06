package lr5;

import java.util.Scanner;

public class GameController {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void run() {
        Game game = new Game();
        while (askForNewGame()) game.startNewGame();
    }

    public static boolean askForNewGame() {
        System.out.print("Start a new game? [Y/n]: ");
        return INPUT.hasNextLine() && (INPUT.nextLine().toLowerCase().equals("y"));
    }
}
