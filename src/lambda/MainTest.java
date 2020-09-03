package lambda;

import java.util.ArrayList;
import java.util.Arrays;

public class MainTest {

    public static void main(String[] args) {
        String[] days = {"monday", "tuesday", "saturday", "sunday"};
        ArrayList<String> daysArrayList = new ArrayList(Arrays.asList(days));
        // long version: myList.replaceAll((String s) -> {return s.toUpperCase();});
        // short version: myList.replaceAll( s-> s.toUpperCase());

        // 3 API using lambda from JAVA 8:
        //java.util.functions: provides target types for lambda
        // java.util.stream: provides classes that support operations on streams of values
        // java.util: enhanced to use lambda expressions

        // UNARY OPERATOR lambda type => single input and returns a value of the same type as the input (like replaceAll)
        daysArrayList.replaceAll( s-> s.toUpperCase());

        // PREDICATE lambda type: single input and returns a boolean
        daysArrayList.removeIf(s -> s.equals("Rick"));
        // anything passes this filter criteria will be removed
        daysArrayList.removeIf(d -> d.length() < 6);


    }
}
