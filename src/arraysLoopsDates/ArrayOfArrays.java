package arraysLoopsDates;

import java.util.Random;

public class ArrayOfArrays {
    static Random rnd = new Random();
    static double[] simpleArray;
    static int[][] yearlySales;
    static String[] names;

    public static void main(String[] args) {
        simpleArray = new double[10];

        for (int i=0; i< simpleArray.length; i++) {
            double randomNum = rnd.nextDouble();
            System.out.println(randomNum);
            simpleArray[i] = randomNum;
        }

        names = new String[4];
        names[0] = "Mari";
        names[1] = "Joli";
        names[2] = "Gizi";
        names[3] = "Pali";
        for(String name:names) {
            System.out.println("név: " + name);
        }

        // 2 dimensional array: 5 arrays of 4 elements each (1.elem: sorok száma, 2. elem: oszlopok száma
        yearlySales = new int[5][4];
       /* for(int i=0; i< yearlySales.length; i++) {
            for ()
        }*/

    }
}
