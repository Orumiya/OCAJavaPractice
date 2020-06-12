package methods;

public class Calculator {
    public static void main(String[] args) {
        int integerNumber = 4;
        double doubleNumber = 2.0;
        float floatNumber = 2.3F;
        int integerNumber2 = 3;

        float sum1 = sum(integerNumber, integerNumber2);
        double sum2 = sum(doubleNumber, integerNumber2);
        double sum3 = sum(floatNumber, integerNumber2);
        double sum4 = sum(floatNumber, doubleNumber);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
        double sum5 = sum(integerNumber, integerNumber); // int --> double
        System.out.println(sum5);
        double sum6 = sum(integerNumber, floatNumber);
        System.out.println(sum6);
    }
    public static float sum(int A, int B) {
        return A + B;
    }

    public static double sum(double A, int B) {
        return A + B;
    }

    public static double sum(float A, int B) {
        return A + B;
    }

    public static double sum(float A, double B) {
        return A + B;
    }
}
