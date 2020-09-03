package interfaces3;

public class MainTest {
    public static void main(String[] args) {
        // c has access only to the superclass methods and fields
        Clothing c = new Shirt();
        Shirt s = new Shirt();

        // r has only access to the IF methods
        Returnable r = new Shirt();

        c.display();
        System.out.println(s.instanceField);
        r.doReturn();

        // CASTING: to access methods from other reference type
        ((Clothing)r).display();
        ((Returnable)c).doReturn();

        //instanceof to avoid inapropriate cast
        if (r instanceof Clothing) {
            ((Clothing) r).display();
        }

        // changing the reference type of an object
        // way2:
        Clothing c2 = s;
        c2.display();
    }
}
