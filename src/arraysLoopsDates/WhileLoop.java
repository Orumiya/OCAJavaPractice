package arraysLoopsDates;

import java.util.Random;

public class WhileLoop {
    static boolean areWeThereYet = false;
    static Random rnd = new Random();
    public static void main(String[] args) {
        while(!areWeThereYet) {
            System.out.println("read book");
            System.out.println("ask: are we there yet?");
            double next = rnd.nextDouble();
            System.out.println(next);
            if (next > 0.8) {
                areWeThereYet = true;
            } else {
                System.out.println("not yet");
            }
        }
        System.out.println("We have arrived!!");

        int count=0;
        while (count < 10) {
            count++;
            System.out.println("still counting!: " + count);
        }
        System.out.println("10 iteration!");
    }

}
