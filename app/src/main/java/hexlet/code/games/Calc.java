package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static String correctAnswer;
    private static String question;

    public static void startGame() throws Exception {
        String rule = "What is the result of the expression?";
        String[][] tasks = new String[Engine.VICTORY_COUNT][2];
        for (int i = 0; i < tasks.length; i++) {
            expression();
            tasks[i][0] = question;
            tasks[i][1] = correctAnswer;
        }
        Engine.letsPlay(rule, tasks);
    }

    private static void expression() {
        int rangeOfRandom = 100;
        int firstTerm = (int) (Math.random() * rangeOfRandom);
        int secondTerm = (int) (Math.random() * rangeOfRandom);
        int result = 0;
        char[] operand = {'+', '-', '*'};
        int operandRandom = (int) (Math.random() * 3);
        switch (operand[operandRandom]) {
            case '+':
                result = firstTerm + secondTerm;
                question = firstTerm + " + " + secondTerm;
                break;
            case '-':
                result = firstTerm - secondTerm;
                question = firstTerm + " - " + secondTerm;
                break;
            case '*':
                result = firstTerm * secondTerm;
                question = firstTerm + " * " + secondTerm;
                break;
        }
        correctAnswer = result + "";
    }
}
