package hexlet.code;

public class Even {
    public static void startGame() throws Exception{
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = Read.reader.readLine();
        System.out.println("Hello, " + name + " !");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int randomNumber;
        int victoryCount = 0;
        String answer;
        String correctAnswer;
        do {
            randomNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber + "\n" +
                    "Your answer: ");
            answer = Read.reader.readLine();
            correctAnswer = correctAnswerIs(randomNumber);
            if (answerCompare(correctAnswer, answer)) {
                System.out.println("Correct!");
                victoryCount++;
            }
            else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" +
                                correctAnswer + "'.");
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

    public static boolean answerCompare(String answer, String correctAnswer) {
        return answer.equals(correctAnswer);
    }

    public static String correctAnswerIs(int randomNumber) {
        String correctAnswer;
        if (randomNumber % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return correctAnswer;
    }
}
