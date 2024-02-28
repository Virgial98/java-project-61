package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static String correctAnswer;
    private static String question;

    public static void startGame() throws Exception {
        String rule = "What number is missing in the progression?";
        String[][] tasks = new String [3][2];
        for (int i = 0; i < 3; i++) {
            expression();
            tasks[i][0] = question;
            tasks[i][1] = correctAnswer;
        }
        Engine.letsPlay(rule,tasks);
    }

    private static void expression() {
        int progrLength = (int) (Math.random() * 5) + 5;
        int questionNumber = (int) (Math.random() * (progrLength - 1)) + 1;
        int progrStep = (int) (Math.random() * 10) + 1;
        int[] progression = new int[progrLength];
        progression[0] = (int) (Math.random() * 100);
        question = "" + progression[0];
        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + progrStep;
            if(i == questionNumber) {
                question = question + " ..";
                correctAnswer = "" + progression[i];
                continue;
            }
            question = question + " " + progression[i];
        }
    }
}