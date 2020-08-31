package arraysLoopsDates;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Mari";
        names[1] = "Unavailable";
        names[2] = "Gizi";
        names[3] = "Pali";
        names[4] = "Joli";
        for(int i=0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase("unavailable"))
                continue;
            System.out.println(names[i]);
        }
        System.out.println("BREAK: ");

        for(int i=0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase("unavailable"))
                break;
            System.out.println(names[i]);
        }

        System.out.println("Give me a color code!");
        Scanner in = new Scanner(System.in);
        String colorCode = in.nextLine();

        System.out.println(translateColors(colorCode));
    }

    public static String translateColors(String colorCode) {
        switch(colorCode) {
            case "R":
                return "red";
            case "B":
                return "blue";
            case "Y":
                return "yellow";
            default:
                return "no such color";
        }
    }


}
