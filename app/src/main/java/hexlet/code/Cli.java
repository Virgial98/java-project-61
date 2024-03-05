package hexlet.code;

class Cli {
    public static void greetingByName() throws Exception {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = Engine.READER.readLine();
        System.out.println("Hello, " + name + "!");
    }
}
    

