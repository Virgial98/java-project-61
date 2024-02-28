package hexlet.code;

import hexlet.code.games.*;

class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet \n" +
                "2 - Even \n" +
                "3 - Calc \n" +
                "4 - GCD \n" +
                "5 - Progression\n" +
                "0 - Exit");
        System.out.println("Your choice: ");
        String sChoice = Engine.reader.readLine();
        int nChoice = Integer.parseInt(sChoice);
        if(nChoice == 0 || (nChoice <= 0 && nChoice > 5)) {
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
        }

    }
}
