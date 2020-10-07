package primitiveVariables;

public class MathOperations {

    public MathOperations() {
        System.out.println("********* MATH OPERATION EXAMPLES");
        double a = 25;
        double b = 3.33, c = 0;
        c = Math.cos(a);
        System.out.println("cos 1.99 = " + c);
        c = Math.sin(b);
        System.out.println("sin 3.33 = " + c);
        c = Math.exp(a);
        System.out.println("e^1.99 = " + c);
        c = Math.max(a, b);
        System.out.println("max of the 2 values: " + c);
        System.out.println("min of the 2 values: " + Math.min(a, b));
        c = Math.pow(a, b);
        System.out.println("a^b = " + c);
        c = Math.sqrt(a);
        System.out.println("square root of 25: " + c);
        c = Math.random();
        System.out.println("random number 0.0 <= c < 1.0" + c);

        int d = 5;
        int e = 4;
        System.out.println("rounding example with ints: " + Math.round(d/e));
        double result = Math.round(d/e);
        System.out.println("rounding is still int, even if the result is stored in a double: " + result);
        double doubleResult = d/(double)e;
        System.out.println("doubleResult: " + doubleResult);
        double result3 =Math.round(doubleResult * 1000);
        result3 = result3/1000;
        double result2 = Math.round((double)d *100);
        result2 = result2 / 100;
        System.out.println("result2: " + result2);
        System.out.println("result3: " +result3);
        double result4 =Math.round((double)d/e * 1000) /1000;
        System.out.println("integer division in floating point context: " + result4);
    }
}
