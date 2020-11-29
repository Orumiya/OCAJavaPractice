package hackerrank;

import java.util.Arrays;

public class Staircase {
    public static void main(String[] args) {
       staircase(6);
        int[] inputArray = {1 , 8, 3, 4, 5};
        miniMaxSum(inputArray);
    }

    static void staircase(int n) {

        int iter = 1;
        while(iter <= n) {
            int i =0;
            while(i < n) {
                if(i >= (n - iter)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                i++;

            }
            iter++;
            System.out.println();
        }
    }

    static void miniMaxSum(int[] arr) {
        long minSum = 0;
        long maxSum = 0;
        if(arr.length > 0) {
            Arrays.sort(arr);
            int i=0;
            while(i < arr.length-1) {
                minSum += (long)arr[i];
                i++;
            }
            int j =4;
            while(j > 0) {
                maxSum += (long)arr[j];
                j--;
            }
        }
        System.out.println(""+ minSum + " " + maxSum);
    }
}
