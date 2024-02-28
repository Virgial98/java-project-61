package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static String correctAnswer;
    private static String question;

    public static void startGame() throws Exception {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] tasks = new String [3][2];
        for (int i = 0; i < 3; i++) {
            expression();
            tasks[i][0] = question;
            tasks[i][1] = correctAnswer;
        }
        Engine.letsPlay(rule,tasks);
    }

    private static void expression() {
        int randomNumber = (int) (Math.random() * 10000) + 1;
        question = "" + randomNumber;
        if (isPrime(randomNumber)) {
            correctAnswer = "yes";
        }
        else {
            correctAnswer = "no";
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
