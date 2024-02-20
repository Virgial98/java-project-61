package hexlet.code;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Cli {
    public static void greetingByName() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("May I have your name?");
        String name = reader.readLine();
        System.out.println("Hello, " + name + " !");
    }
}
