package hexlet.code;

class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet \n" +
                "2 - Even \n" +
                "0 - Exit");
        System.out.println("Your choice: ");
        String sChoice = Read.reader.readLine();
        int nChoice = Integer.parseInt(sChoice);
        if(nChoice == 0 || (nChoice <= 0 && nChoice > 2)) return;
        if (nChoice == 1) {
            Cli.greetingByName();
        }
        else if (nChoice == 2) {
            Even.startGame();
        }
    }
}
