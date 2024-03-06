package hexlet.code;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Engine {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static final int VICTORY_COUNT = 3;

    public static void letsPlay(String rule, String[][] tasks) throws Exception {
        int taskNumber = 0;
        String answer;
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = READER.readLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(rule);
        do {
            System.out.println("Question: " + tasks[taskNumber][0] + "\n" + "Your answer: ");
            answer = READER.readLine();
            if (tasks[taskNumber][1].equals(answer)) {
                System.out.println("Correct!");
                taskNumber++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + tasks[taskNumber][1] + "'.");
                break;
            }
        } while (taskNumber != VICTORY_COUNT);
        if (taskNumber == VICTORY_COUNT) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
