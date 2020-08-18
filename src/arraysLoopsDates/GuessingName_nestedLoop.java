package arraysLoopsDates;

public class GuessingName_nestedLoop {
    public static void main(String[] args) {
        String name= "Lemmy";
        String guess = "";
        int attempts = 0;

        while(!guess.equalsIgnoreCase(name)) {
            guess = "";
            while (guess.length() < name.length()) {
                char asciiChar = (char)(Math.random() *26 + 97);
                guess += asciiChar;
            }
            attempts++;
        }

        System.out.println(name + " was found after " + attempts + " attemps.");

    }
}
