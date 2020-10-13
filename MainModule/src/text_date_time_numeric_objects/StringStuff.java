package text_date_time_numeric_objects;

public class StringStuff {
    public StringStuff() {
        System.out.println("************** Strings *************");

        String a = "Hello";
        String b = a;
        String c = "Hello";
        System.out.println("a equals c: " + a.equals(c));
        System.out.println("a == c: " + (a == c));
        System.out.println("a == b: " + (a == b));
        System.out.println("a.compareTo c: " + a.compareTo(c));
        String d = "Hello".intern(); // Call to 'intern()' on compile-time constant is unnecessary
        System.out.println("a equals d: " + a.equals(d));
        System.out.println("a == d: " + (a == d));
        System.out.println("a hashcode: " + a.hashCode() + " d: " +  d.hashCode());
        String e = new String("Hello");
        String f = c.intern();

        // strings are immutable
        String one = " some Text ";
        System.out.println(one);
        // doesn't modify the original string, but it can be reassigned
        one = one.trim();
        System.out.println("without whitespaces: " + one);
        String two = one.concat(" comes here"); // some Text comes here
        System.out.println(two);
        String three = two.toUpperCase();
        System.out.println("upper case: " + three + " original: " + two); // upper case: SOME TEXT COMES HERE original: some Text comes here
        System.out.println(three.contains("s")); // false

        String four = 1 + 1 + "text";
        System.out.println(four); // 2text
        String five = "text" + 1 + 1; // text11
        System.out.println(five);

        // indexing
        String text = "Hello world!";
        System.out.println(text.substring(0,5)); // start: inclusive, end: exclusive
        System.out.println(text.indexOf('o'));
        System.out.println(text.indexOf('o', 5)); // from index
        System.out.println(text.lastIndexOf('d'));
        System.out.println(text.lastIndexOf('p'));
        char g = text.charAt(2);
        int h = text.length();
        // char i = text.charAt(15);  // --> throws StringIndexOutOfBoundsException

    }
}
