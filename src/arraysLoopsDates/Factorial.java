package arraysLoopsDates;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialCounter(6));
    }

    public static int factorialCounter(int target) {
        int fact = 1;
        do{
            fact *= target--;
        } while (target > 0);
        return fact;
    }
}
