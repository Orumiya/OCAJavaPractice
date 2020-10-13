package text_date_time_numeric_objects;

public class StringBuilderTest {
    public StringBuilderTest() {
        // String builder objects are mutable
        StringBuilder sb = new StringBuilder(); // initial capacity = 16
        sb.append(345);
        sb.append("text");
        sb.append(3.14);
        sb.append('d');
        sb.insert(0,'r');
        sb.insert(0, "beginning");
        System.out.println(sb); // beginningr345text3.14d

        sb.delete(9, 17);
        System.out.println(sb);
        sb.insert(9, " of ");
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        sb.replace(14, 19, "a beautiful friendship");
        sb.insert(0, "this is the ");
        System.out.println(sb);
        int length = sb.length();
        int capacity = sb.capacity();
        System.out.println("length: " + length + ", capacity: " + capacity);
        StringBuilder sb2 = new StringBuilder(20); // capacity

    }
}
