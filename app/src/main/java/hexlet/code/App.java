package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

class App {
    public static void main(String[] args) throws Exception {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet\s
                2 - Even\s
                3 - Calc\s
                4 - GCD\s
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.println("Your choice: ");
        String sChoice = Engine.READER.readLine();
        int nChoice = Integer.parseInt(sChoice);
        if (nChoice == 0 || (nChoice <= 0 && nChoice > 6)) {
            return;
        }
        switch (nChoice) {
            case 1:
                Cli.greetingByName();
                break;
            case 2:
                Even.startGame();
                break;
            case 3:
                Calc.startGame();
                break;
            case 4:
                GCD.startGame();
                break;
            case 5:
                Progression.startGame();
                break;
            case 6:
                Prime.startGame();
                break;
            default:
                break;
        }

    }
}
