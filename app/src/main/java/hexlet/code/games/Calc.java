package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static String correctAnswer;
    private static String question;

    public static void startGame() throws Exception {
        String rule = "What is the result of the expression?";
        String[][] tasks = new String [3][2];
        for (int i = 0; i < 3; i++) {
            expression();
            tasks[i][0] = question;
            tasks[i][1] = correctAnswer;
        }
        Engine.letsPlay(rule,tasks);
    }

    private static void expression() {
        int firstTerm = (int) (Math.random() * 100);
        int secondTerm = (int) (Math.random() * 100);
        int result = 0;
        char[] operand = {'+', '-', '*'};
        int operandRandom = (int) (Math.random() * 3) ;
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
