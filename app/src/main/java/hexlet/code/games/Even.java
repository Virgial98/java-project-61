package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static String correctAnswer;
    private static String question;

    public static void startGame() throws Exception {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] tasks = new String[Engine.VICTORY_COUNT][2];
        for (int i = 0; i < tasks.length; i++) {
            expression();
            tasks[i][0] = question;
            tasks[i][1] = correctAnswer;
        }
        Engine.letsPlay(rule, tasks);
    }

    private static void expression() {
        final int rangeOfRandom = 100;
        int randomNumber = (int) (Math.random() * rangeOfRandom);
        question = randomNumber + "";
        if (randomNumber % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
    }
}
