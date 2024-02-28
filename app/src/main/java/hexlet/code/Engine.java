package hexlet.code;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Engine {
    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void letsPlay(String rule,String[][] tasks) throws Exception {
        int victoryCount = 0;
        String answer;
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = reader.readLine();
        System.out.println("Hello, " + name + " !");
        System.out.println(rule);
        do {
            System.out.println("Question: " + tasks[victoryCount][0] + "\n" +
                    "Your answer: ");
            answer = reader.readLine();
            if (tasks[victoryCount][1].equals(answer)) {
                System.out.println("Correct!");
                victoryCount++;
            }
            else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" +
                        tasks[victoryCount][1] + "'.");
                break;
            }
        } while (victoryCount != 3);
        if (victoryCount == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
        else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
