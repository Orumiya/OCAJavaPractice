package text_date_time_numeric_objects;

public class WrapperClassesTest {
    public WrapperClassesTest() {
        System.out.println("Wrapper classes");
        System.out.println("" +
                "XXXX = XXXX.valueOf(xxx vagy \"string\") \n " +
                "xxx = XXX.xxxValue() \n" +
                "XXX/xxx = XXX.parseXxx(\"string\") \n" +
                "String = String.valueOf(xxx)");
        int a = 42;
        // primitive /string to wrapper object with valueOf --> XXXX.valueOf(int vagy "string")
        Integer b = Integer.valueOf(a);
        // extract primitive value out of the wrapper class with wrapperXXX.xxxValue()
        int c = b.intValue();
        System.out.println(b.getClass().getSimpleName());
       // Cannot resolve method 'getClass()' ---> c is an int: System.out.println(c.getClass().getSimpleName());
        b = a; // autoboxing
        System.out.println(b.getClass().getSimpleName());
        c = b;

        String d = "12.34";
        Float f = Float.valueOf(d);

        // creates wrapper or primitive out of a string --> XXX.parseXxx("string")
        float ff = Float.parseFloat(d);
        Double dd = Double.parseDouble(d);
        System.out.println(f.getClass().getSimpleName() + ": "+ f + ", " + ff + ", Double: " + dd);

        // convert primitive to a string --> String.valueOf()
        String s = String.valueOf(a);
        System.out.println(s);
        System.out.println(Short.MIN_VALUE + ", " + Short.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE + ", " + Byte.MAX_VALUE);
       // Short g = Short.parseShort(d); // NumberFormatException: For input string: "12.34"
        Double gh = Double.parseDouble(d);
        System.out.println("double value: " + gh);
        String gh_string = String.valueOf(gh);
        System.out.println(gh_string);

    }
}
