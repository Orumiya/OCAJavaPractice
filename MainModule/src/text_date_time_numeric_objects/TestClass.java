package text_date_time_numeric_objects;

public class TestClass {
    // instead of String[] String... is acceptable --> varargs
    public static void main(String... args) {

       StringStuff strings = new StringStuff();
       StringBuilderTest sb = new StringBuilderTest();
       WrapperClassesTest wp = new WrapperClassesTest();
        BigDecimalTest bd = new BigDecimalTest();
        MethodChainingTest mch = new MethodChainingTest();
        LocalDateAndTimeTest lcDt = new LocalDateAndTimeTest();
        InstantDurationPeriod idp = new InstantDurationPeriod();

    }
}