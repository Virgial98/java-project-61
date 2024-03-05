package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static String correctAnswer;
    private static String question;

    public static void startGame() throws Exception {
        String rule = "Find the greatest common divisor of given numbers.";
        String[][] tasks = new String[3][2];
        for (int i = 0; i < 3; i++) {
            expression();
            tasks[i][0] = question;
            tasks[i][1] = correctAnswer;
        }
        Engine.letsPlay(rule,tasks);
    }

    private static void expression() {
        int firstTerm = (int) ((Math.random() * 100) + 1);
        int secondTerm = (int) ((Math.random() * 100) + 1);
        question = firstTerm + " " + secondTerm;
        if (firstTerm < secondTerm) {
            swapValues(firstTerm, secondTerm);
        }
        int remain;
        int result;
        do {
            result = secondTerm;
            remain = firstTerm % secondTerm;
            firstTerm = secondTerm;
            secondTerm = remain;
        }while (remain != 0);
        correctAnswer = result + "";
    }

    public static void swapValues(int m, int n) {
        // Swapping the values
        int temp = m;
        m = n;
        n = temp;
    }
}
