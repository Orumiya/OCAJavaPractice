package arraysLoopsDates;

import com.sun.security.jgss.GSSUtil;

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

        int height = 5, width = 10;
        for(int i=0; i < height; i++) {
            for(int j=0; j < width; j++) {
                System.out.print('@');
            }
            System.out.println();
        }

        // 2 dimensional array: 5 arrays of 4 elements each (1.elem: sorok száma, 2. elem: oszlopok száma
        yearlySales = new int[5][4];
       for(int i=0; i< yearlySales.length; i++) {
            for (int j = 0; j < yearlySales[i].length; j++) {
                yearlySales[i][j] = (int)(Math.random() * 100);
                if (j == yearlySales[i].length - 1) {
                    System.out.print(yearlySales[i][j]);
                } else {
                    System.out.print(yearlySales[i][j] + "|");
                }
            }
           System.out.println();
        }


    }
}
